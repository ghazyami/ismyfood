package com.github.ghazyami.ismyfood.off.boundary;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.github.ghazyami.ismyfood.off.entity.ProductResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = OpenFoodFactsClient.OPENFOODFACTS_API_URL)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ClientHeaderParam(name = "User-Agent", value = "ISMYFOOD APP")
public interface OpenFoodFactsClient {

	String OPENFOODFACTS_API_URL = "https://world.openfoodfacts.org/api/v0";

	@GET
	@Path("products/{productCode}.json")
	ProductResponse getProductByCode(@PathParam("productCode") String code);
}
