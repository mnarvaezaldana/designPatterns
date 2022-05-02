package com.yucatancorp.factorymethod;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.box();
        pizza.deliver();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
