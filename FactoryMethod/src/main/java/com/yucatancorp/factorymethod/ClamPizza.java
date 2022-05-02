package com.yucatancorp.factorymethod;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut clam pizza");
    }

    @Override
    public void box() {
        System.out.println("box clam pizza");
    }

    @Override
    public void deliver() {
        System.out.println("deliver clam pizza");
    }
}
