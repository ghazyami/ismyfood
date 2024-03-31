package com.github.ghazyami.ismyfood.server.rules.entity;

import com.github.ghazyami.ismyfood.off.entity.Product;

import java.io.Serializable;

public class ProcessProductResponse implements Serializable {

    private boolean positiveRuleMatch;
    private String message;
    private Product product;

    public boolean isPositiveRuleMatch() {
        return positiveRuleMatch;
    }

    public void setPositiveRuleMatch(boolean positiveRuleMatch) {
        this.positiveRuleMatch = positiveRuleMatch;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
