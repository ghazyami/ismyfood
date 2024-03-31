package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;


import jakarta.json.bind.annotation.JsonbProperty;


public class NutrientLevels implements Serializable {

    private String fat;

    private String salt;

    @JsonbProperty("saturated-fat")
    private String saturatedFat;

    private String sugars;

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }
}
