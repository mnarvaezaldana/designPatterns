package com.yucatancorp.factorymethod;

import com.yucatancorp.factorymethod.pizzastores.CaliforniaPizzaStore;
import com.yucatancorp.factorymethod.pizzastores.ChicagoPizzaStore;
import com.yucatancorp.factorymethod.pizzastores.NYPizzaStore;
import com.yucatancorp.factorymethod.pizzastores.PizzaStore;
import com.yucatancorp.factorymethod.pizzatypes.Pizza;

public class MyClass {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizzaOne = nyStore.orderPizza("cheese");
        Pizza pizzaTwo = chicagoStore.orderPizza("veggie");
        Pizza pizzaThree = californiaStore.orderPizza("clam");
    }

}