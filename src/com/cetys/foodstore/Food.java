package com.cetys.foodstore;

public abstract class Food extends Item {

    private String category;

    // ***** GETTERS & SETTERS *****
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
