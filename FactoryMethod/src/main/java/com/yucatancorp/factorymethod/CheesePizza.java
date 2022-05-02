package com.yucatancorp.factorymethod;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("box cheese pizza");
    }

    @Override
    public void deliver() {
        System.out.println("deliver cheese pizza");
    }
}
