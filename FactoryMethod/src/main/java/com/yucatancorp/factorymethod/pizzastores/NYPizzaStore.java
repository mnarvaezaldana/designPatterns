package com.yucatancorp.factorymethod.pizzastores;

import com.yucatancorp.factorymethod.nystylepizzas.NYStyleCheesePizza;
import com.yucatancorp.factorymethod.nystylepizzas.NYStyleClamPizza;
import com.yucatancorp.factorymethod.nystylepizzas.NYStylePepperoni;
import com.yucatancorp.factorymethod.nystylepizzas.NYStyleVeggiePizza;
import com.yucatancorp.factorymethod.pizzatypes.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoni();
        } else return null;
    }
}
