package com.cetys.foodstore;

import java.util.ArrayList;
import java.util.List;

public abstract class Order
{
    // private int totalItems;
    private float subTotalCost;
    private List<Item> items;

    Order()
    {
        items = new ArrayList<Item>();
    }

    abstract float getTotalCost();

    public int getTotalItems()
    {
       return items.size();
    }

    public void addItem(Item newItem)
    {
        subTotalCost += newItem.getPrice();
        items.add(newItem);
    }

    public List<Item> getItems()
    {
        return items;
    }

    // ***** GETTERS & SETTERS *****
    public float getSubTotalCost()
    {
        return subTotalCost;
    }
}


