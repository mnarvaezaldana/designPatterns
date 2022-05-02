package com.yucatancorp.factorymethod;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut Veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("box Veggie pizza");
    }

    @Override
    public void deliver() {
        System.out.println("deliver Veggie pizza");
    }
}
