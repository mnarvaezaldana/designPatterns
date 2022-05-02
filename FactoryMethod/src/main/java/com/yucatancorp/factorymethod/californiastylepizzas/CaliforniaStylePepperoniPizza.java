package com.yucatancorp.factorymethod.californiastylepizzas;

import com.yucatancorp.factorymethod.pizzatypes.PepperoniPizza;

public class CaliforniaStylePepperoniPizza extends PepperoniPizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("California style");
        System.out.println("--------");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("California style");
        System.out.println("--------");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("California style");
        System.out.println("--------");
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("California style");
        System.out.println("--------");
    }
}
