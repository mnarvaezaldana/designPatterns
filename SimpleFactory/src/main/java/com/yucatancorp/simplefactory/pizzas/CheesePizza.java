package com.yucatancorp.simplefactory.pizzas;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Prepare cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Box cheese Pizza");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver cheese Pizza");
    }
}
