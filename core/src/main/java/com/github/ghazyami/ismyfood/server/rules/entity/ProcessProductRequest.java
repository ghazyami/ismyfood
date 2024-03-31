package com.github.ghazyami.ismyfood.server.rules.entity;

import java.io.Serializable;


import jakarta.validation.constraints.NotEmpty;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

public class ProcessProductRequest implements Serializable {

	public static String RULE_FILE_SUFFIX = ".el";

	@NotEmpty
	private String productCode;

	private String ruleName;

	private boolean includeProduct;

	private boolean inline;

	private String inlineRule;

	public String getRuleFileName() {
		return getRuleName() + RULE_FILE_SUFFIX;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public boolean isIncludeProduct() {
		return includeProduct;
	}

	public void setIncludeProduct(boolean includeProduct) {
		this.includeProduct = includeProduct;
	}

	public boolean isInline() {
		return inline;
	}

	public void setInline(boolean inline) {
		this.inline = inline;
	}

	public String getInlineRule() {
		return inlineRule;
	}

	public void setInlineRule(String inlineRule) {
		this.inlineRule = inlineRule;
	}
}
