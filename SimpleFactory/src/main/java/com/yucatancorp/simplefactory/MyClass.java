package com.yucatancorp.simplefactory;

import com.yucatancorp.simplefactory.pizzas.Pizza;

public class MyClass {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        Pizza mPizza = factory.createPizza("clam");
        System.out.println(mPizza.toString());
    }
}