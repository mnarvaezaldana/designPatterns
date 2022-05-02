package com.yucatancorp.simplefactory;

public class MyClass {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("clam");

    }
}