package com.github.ghazyami.ismyfood.server.rules.boundary;

import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductResponse;
import com.github.ghazyami.ismyfood.server.rules.control.RulesProcessor;
import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductRequest;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("rules")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RulesResourceImpl implements RulesResource {

	@Inject
	RulesProcessor processor;

	@POST
	@Path("process")
	public ProcessProductResponse fetchProductByCode(@Valid ProcessProductRequest request) {
		ProcessProductResponse response = processor.processRulesForProduct(request);
		if (!request.isIncludeProduct()) {
			response.setProduct(null);
		}
		return response;
	}
}
