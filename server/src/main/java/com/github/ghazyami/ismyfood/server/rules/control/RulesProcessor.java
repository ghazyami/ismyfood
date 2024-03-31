package com.github.ghazyami.ismyfood.server.rules.control;

import java.io.*;

import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductResponse;
import com.github.ghazyami.ismyfood.off.entity.Product;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.github.ghazyami.ismyfood.off.boundary.OpenFoodFactsClient;
import com.github.ghazyami.ismyfood.off.entity.ProductResponse;
import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductRequest;

import jakarta.el.ELProcessor;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.InternalServerErrorException;

@RequestScoped
public class RulesProcessor {

	@Inject
	@RestClient
	OpenFoodFactsClient openFoodFactsClient;

	@Inject
	CacheService cache;

	public ProcessProductResponse processRulesForProduct(ProcessProductRequest request) {
		// Get product from OpenFoodFacts
		ProcessProductResponse processProductResponse = new ProcessProductResponse();
		final ProductResponse productResponse = cache.get(request).orElseGet(() -> openFoodFactsClient.getProductByCode(request.getProductCode()));
		if (!productResponse.isFound()) {
			processProductResponse.setPositiveRuleMatch(false);
			processProductResponse.setMessage("Product not found");
			return processProductResponse;
		}

		// process rules
		processProductResponse.setProduct(processProductResponse.getProduct());
		try {
			final ELProcessor processor = new ELProcessor();

			applyPreRules(processor, productResponse.getProduct());
			if (request.isInline()) {
				applyInlineRules(processor, request.getInlineRule());
			} else {
				applyFileRules(processor, request.getRuleFileName());
			}
			applyPostRules(processor, processProductResponse);
			cache.put(request, productResponse);
		} catch (Exception e) {
			processProductResponse.setPositiveRuleMatch(false);
			processProductResponse.setMessage(String.format("Could not process rule %s: %s", request.getRuleName(), e.getMessage()));
		}
		return processProductResponse;
	}

	protected void applyPreRules(ELProcessor processor, Product product) {
		processor.defineBean("product", product);
	}

	protected void applyInlineRules(ELProcessor processor, String rule) {
		try  {
			String[] lines = rule.split("\n");
            for (String line : lines) {
                processor.eval(line);
            }
		} catch (Exception e) {
			throw new InternalServerErrorException(e.getMessage());
		}
	}

	protected void applyFileRules(ELProcessor processor, String fileName) {
		InputStream in = RulesProcessor.class.getResourceAsStream("/rules/" + fileName);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
			reader.lines().forEach(processor::eval);
		} catch (IOException e) {
			throw new InternalServerErrorException(e.getMessage());
		}
	}

	protected void applyPostRules(ELProcessor processor, ProcessProductResponse processProductResponse) {
		processor.defineBean("processing_result", processProductResponse);
		processor.eval("processing_result.positiveRuleMatch = positiveRuleMatch");
		processor.eval("processing_result.message = message");
	}
}
