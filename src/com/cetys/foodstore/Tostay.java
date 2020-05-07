package com.cetys.foodstore;

public class Tostay extends Order {

    private float tip;

    Tostay()
    {
        this.tip = 0;
    }

    Tostay(float tip)
    {
        this.tip = tip;
    }

    @Override
    public float getTotalCost()
    {
        float total;
        total = getSubTotalCost() + (getSubTotalCost() * getTip()) ;
        return total;
    }

    // ***** GETTERS & SETTERS *****
    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }
}


