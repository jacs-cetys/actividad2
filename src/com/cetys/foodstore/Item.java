package com.cetys.foodstore;

public abstract class Item
{
    private String name;
    private float price;

    // ***** GETTERS & SETTERS *****
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
