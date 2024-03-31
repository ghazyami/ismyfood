package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;


import jakarta.json.bind.annotation.JsonbProperty;

public class ProductResponse implements Serializable {

    private Product product;

    private String code;

    private int status;

    @JsonbProperty("status_verbose")
    private String statusVerbose;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusVerbose() {
        return statusVerbose;
    }

    public void setStatusVerbose(String statusVerbose) {
        this.statusVerbose = statusVerbose;
    }

    public boolean isFound() {
        return getStatus() == 1;
    }
}
