package com.yucatancorp.simplefactory;

import com.yucatancorp.simplefactory.pizzas.CheesePizza;
import com.yucatancorp.simplefactory.pizzas.ClamPizza;
import com.yucatancorp.simplefactory.pizzas.PepperoniPizza;
import com.yucatancorp.simplefactory.pizzas.Pizza;
import com.yucatancorp.simplefactory.pizzas.VeggiePizza;

public class SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }

}
