package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;

public class SelectedImages implements Serializable {

    private SelectedImage front;

    private SelectedImage ingredients;

    private SelectedImage nutrition;

    public SelectedImage getFront() {
        return front;
    }

    public void setFront(SelectedImage front) {
        this.front = front;
    }

    public SelectedImage getIngredients() {
        return ingredients;
    }

    public void setIngredients(SelectedImage ingredients) {
        this.ingredients = ingredients;
    }

    public SelectedImage getNutrition() {
        return nutrition;
    }

    public void setNutrition(SelectedImage nutrition) {
        this.nutrition = nutrition;
    }
}
