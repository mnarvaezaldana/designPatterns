package com.yucatancorp.strategy.rigthBookAproach;

public class ModelDuck extends Duck{

    /**
     * Step four:
     *
     * This class extends Duck and it has the methods and fields from that class and also it has access
     * to the methods from Duck, and the abstract methods need to be implemented.
     *
     * The constructor set the FlyBehavior and QuackBehavior needed at the instantiation of the MallarDuck
     * but it could be changed later (and/or at runtime) with the set methods either from this class
     * or from the main class, or the class that uses this strategy pattern.
     *
     * --now go to MyClass
     */

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavoir = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("This is a model Duck!!");
    }
}
