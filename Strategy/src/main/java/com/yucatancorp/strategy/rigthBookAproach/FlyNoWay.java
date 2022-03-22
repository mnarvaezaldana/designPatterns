package com.yucatancorp.strategy.rigthBookAproach;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("This duck can not fly.");
    }
}
