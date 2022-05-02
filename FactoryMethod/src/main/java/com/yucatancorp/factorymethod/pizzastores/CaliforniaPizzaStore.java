package com.yucatancorp.factorymethod.pizzastores;

import com.yucatancorp.factorymethod.californiastylepizzas.CaliforniaStyleCheesePizza;
import com.yucatancorp.factorymethod.californiastylepizzas.CaliforniaStyleClamPizza;
import com.yucatancorp.factorymethod.californiastylepizzas.CaliforniaStylePepperoniPizza;
import com.yucatancorp.factorymethod.californiastylepizzas.CaliforniaStyleVeggiePizza;
import com.yucatancorp.factorymethod.pizzatypes.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else return null;
    }
}
