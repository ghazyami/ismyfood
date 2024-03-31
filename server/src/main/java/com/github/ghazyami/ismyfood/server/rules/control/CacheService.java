package com.github.ghazyami.ismyfood.server.rules.control;

import java.util.Objects;
import java.util.Optional;

import javax.cache.Cache;

import com.github.ghazyami.ismyfood.off.entity.ProductResponse;
import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductResponse;
import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.annotation.Metric;

import com.github.ghazyami.ismyfood.server.rules.entity.ProcessProductRequest;

import jakarta.annotation.Resource;
import jakarta.enterprise.concurrent.ManagedExecutorService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CacheService {

	@Inject
	Cache<String, ProductResponse> cache;

	@Inject
	@Metric(name = "cache.hit", absolute = true)
	Counter hitCounter;

	@Inject
	@Metric(name = "cache.miss", absolute = true)
	Counter missCounter;

	@Resource
	ManagedExecutorService executor;

	public Optional<ProductResponse> get(ProcessProductRequest request) {
		if (Objects.nonNull(cache) && cache.containsKey(request.getProductCode())) {
			hitCounter.inc();
			ProductResponse productResponse = cache.get(request.getProductCode());
			return Optional.of(productResponse);
		} else {
			missCounter.inc();
			return Optional.empty();
		}
	}

	public void put(ProcessProductRequest request, ProductResponse response) {
		if (Objects.nonNull(cache)) {
			executor.submit(() -> cache.put(request.getProductCode(), response));
		}
	}



}
