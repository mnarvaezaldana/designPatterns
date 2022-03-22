package com.yucatancorp.strategy.rigthBookAproach;

public class MallarDuck extends Duck{

    public MallarDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavoir = new Quack();
    }

    @Override
    public void display() {
        System.out.println("A MallarDuck has been displayed");
    }
}
