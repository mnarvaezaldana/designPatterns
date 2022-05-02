package com.yucatancorp.simplefactory.pizzas;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Box clam Pizza");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver clam Pizza");
    }
}
