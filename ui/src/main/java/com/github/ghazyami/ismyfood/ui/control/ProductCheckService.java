package com.github.ghazyami.ismyfood.ui.control;

import java.io.Serializable;

import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductResponse;
import jakarta.annotation.PostConstruct;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.github.ghazyami.ismyfood.server.rules.boundary.RulesResource;
import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductRequest;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@SessionScoped
@Named
public class ProductCheckService implements Serializable {

	@Inject
	@RestClient
	RulesResource server;

	@PostConstruct
	protected void setup() {
		request.setInlineRule("positiveRuleMatch = true\nmessage = 'safe according to my custom rule'");
	}

	private ProcessProductRequest request = new ProcessProductRequest();
	private ProcessProductResponse response;

	public void lookup() {
		response = server.fetchProductByCode(request);
	}


	public ProcessProductRequest getRequest() {
		return request;
	}

	public ProcessProductResponse getResponse() {
		return response;
	}

}
