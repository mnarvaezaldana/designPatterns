package com.yucatancorp.strategy.rigthBookAproach;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavoir = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("This is a model Duck!!");
    }
}
