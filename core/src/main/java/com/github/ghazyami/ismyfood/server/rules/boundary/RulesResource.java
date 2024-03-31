package com.github.ghazyami.ismyfood.server.rules.boundary;

import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductRequest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(configKey = "server")
@Path("rules")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface RulesResource {

	@POST
	@Path("process")
	ProcessProductResponse fetchProductByCode(@Valid ProcessProductRequest request);
}
