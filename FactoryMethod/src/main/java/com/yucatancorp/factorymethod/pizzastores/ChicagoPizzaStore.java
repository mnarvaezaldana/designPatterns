package com.yucatancorp.factorymethod.pizzastores;

import com.yucatancorp.factorymethod.chicagostylepizzas.ChicagoStyleCheesePizza;
import com.yucatancorp.factorymethod.chicagostylepizzas.ChicagoStyleClamPizza;
import com.yucatancorp.factorymethod.chicagostylepizzas.ChicagoStylePepperoniPizza;
import com.yucatancorp.factorymethod.chicagostylepizzas.ChicagoStyleVeggiePizza;
import com.yucatancorp.factorymethod.pizzatypes.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } return null;
    }
}
