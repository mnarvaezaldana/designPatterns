package com.yucatancorp.strategy.rigthBookAproach;

public class Quack implements QuackBehavoir{

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
    public void quack() {
        System.out.println("Quack as a normal Duck");
    }
}
