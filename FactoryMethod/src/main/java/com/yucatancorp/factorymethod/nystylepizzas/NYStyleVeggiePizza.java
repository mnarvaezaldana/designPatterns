package com.yucatancorp.factorymethod.nystylepizzas;

import com.yucatancorp.factorymethod.pizzatypes.VeggiePizza;

public class NYStyleVeggiePizza extends VeggiePizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("NY style");
        System.out.println("--------");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("NY style");
        System.out.println("--------");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("NY style");
        System.out.println("--------");
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("NY style");
        System.out.println("--------");
    }
}
