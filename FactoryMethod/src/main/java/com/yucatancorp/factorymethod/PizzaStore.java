package com.yucatancorp.factorymethod;

import com.yucatancorp.factorymethod.pizzatypes.Pizza;

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
