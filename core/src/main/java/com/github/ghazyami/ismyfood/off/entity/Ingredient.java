package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;


import jakarta.json.bind.annotation.JsonbProperty;

public class Ingredient implements Serializable {

    @JsonbProperty("from_palm_oil")
    private String fromPalmOil;

    private String id;

    private String origin;

    private String percent;

    private int rank;

    private String text;

    private String vegan;

    private String vegetarian;

    public String getFromPalmOil() {
        return fromPalmOil;
    }

    public void setFromPalmOil(String fromPalmOil) {
        this.fromPalmOil = fromPalmOil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVegan() {
        return vegan;
    }

    public void setVegan(String vegan) {
        this.vegan = vegan;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }
}
