package com.yucatancorp.simplefactory.pizzas;

public class VeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Prepare Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Pizza");
    }

    @Override
    public void box() {
        System.out.println("Box Pizza");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver Pizza");
    }
}
