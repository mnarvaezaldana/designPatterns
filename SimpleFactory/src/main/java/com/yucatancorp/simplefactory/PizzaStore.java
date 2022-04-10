package com.yucatancorp.simplefactory;

import com.yucatancorp.simplefactory.pizzas.Pizza;

public class PizzaStore {

    SimpleFactory factory;

    public PizzaStore(SimpleFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.box();
        pizza.deliver();

        return pizza;
    }

}
