package com.yucatancorp.factorymethod.chicagostylepizzas;

import com.yucatancorp.factorymethod.pizzatypes.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Chicago style");
        System.out.println("--------");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("Chicago style");
        System.out.println("--------");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("Chicago style");
        System.out.println("--------");
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("Chicago style");
        System.out.println("--------");
    }
}
