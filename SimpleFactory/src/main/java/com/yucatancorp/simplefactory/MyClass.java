package com.yucatancorp.simplefactory;

import com.yucatancorp.simplefactory.pizzas.Pizza;

public class MyClass {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("clam");

    }
}