package com.cetys.foodstore;

public abstract class Drink extends Item {
    private String size;

    // ***** GETTERS & SETTERS *****
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
