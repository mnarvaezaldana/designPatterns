package com.yucatancorp.simplefactory.pizzas;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Box pepperoni Pizza");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver pepperoni Pizza");
    }
}
