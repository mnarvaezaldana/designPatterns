package com.yucatancorp.simplefactory.pizzas;

public class VeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Prepare veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Box veggie Pizza");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver veggie Pizza");
    }
}
