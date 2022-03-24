package com.yucatancorp.strategy.rigthBookAproach;

public class FlyWithWings implements FlyBehavior{

    /**
     * Second step: You have to implement each Behavior for every behavior needed,
     * in this case the actions needed are:
     *      for Quack: MuteQuack, Quack, Squack
     *      for Fly: FlyWithARocket, FlyWithWings, FlyNoWay
     *
     * this actions implement either flyBehavior of QuackBehavior
     *
     * --now move to Duck class
     */

    @Override
    public void fly() {
        System.out.println("The duck is flying with wings");
    }
}
