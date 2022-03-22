package com.yucatancorp.strategy.rigthBookAproach;

public class FlyWithARocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("This duck will drive a rocketShip and reach outer space.");
    }
}
