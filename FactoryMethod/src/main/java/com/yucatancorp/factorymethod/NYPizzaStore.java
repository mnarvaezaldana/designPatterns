package com.yucatancorp.factorymethod;

import com.yucatancorp.factorymethod.pizzatypes.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return null;
    }
}
