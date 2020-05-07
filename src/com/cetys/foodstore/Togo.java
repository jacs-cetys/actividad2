package com.cetys.foodstore;

public class Togo extends Order
{
    private float shipping;

    Togo()
    {
        shipping = 30.00f;
    }

    @Override
    public float getTotalCost()
    {
        float total;
        total = getSubTotalCost() + getShipping();
        return total;
    }

    // ***** GETTERS & SETTERS *****
    public float getShipping() {
        return shipping;
    }

    public void setShipping(float shipping) {
        this.shipping = shipping;
    }
}
