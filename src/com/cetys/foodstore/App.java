package com.cetys.foodstore;

public class App {

    public static void main(String[] args) {



        Item burger = new Burger();
        burger.setName("doble");
        burger.setPrice(3.15f);

        Item burger2 = new Burger();
        burger2.setName("sensiclla");
        burger2.setPrice(110.00f);

        Order newOrder = new Togo();
        newOrder.addItem(burger);
        newOrder.addItem(burger2);

        System.out.println( "Order para llevar: " + newOrder.getTotalCost());

        Order newOrder2 = new Tostay(0.10f);
        newOrder2.addItem(burger);
        newOrder2.addItem(burger2);

        System.out.println( "Order para comer en el local (con propina): " + newOrder2.getTotalCost());

        Order newOrder3 = new Tostay();
        newOrder3.addItem(burger);
        newOrder3.addItem(burger2);
        System.out.println( "Order para comer en el local (sin propina): " + newOrder3.getTotalCost());
    }

}
