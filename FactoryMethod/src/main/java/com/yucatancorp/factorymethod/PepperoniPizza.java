package com.yucatancorp.factorymethod;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("box pepperoni pizza");
    }

    @Override
    public void deliver() {
        System.out.println("deliver pepperoni pizza");
    }
}
