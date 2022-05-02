package com.yucatancorp.factorymethod.pizzatypes;

public abstract class Pizza {

    abstract public void prepare();
    abstract public void cut();
    abstract public void box();
    abstract public void deliver();
}
