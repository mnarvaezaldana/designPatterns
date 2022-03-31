package com.yucatancorp.strategy.rigthBookAproach;

public abstract class Duck {

    /**
     * Step three:
     *
     * Here we have two fields one for FlyBehavior and another for QuackBehavior, which each one of
     * them will receive a implementation of those interfaces (it will received either at the constructor
     * or with the method setter)
     *
     * The method "perform(task)" call the object which implements the behavior interface and perform
     * the method (task) in it (that method is implemented in the class that extends the behavior)
     * so no matter which class is, as soon as it implements the interface behavior, the method could
     * be called.
     *
     * There could be more methods like "swim", "display" etc. and like those are the same, there is no
     * need of a variety of implementations, so Duck class cauld implement them and every class that
     * extends Duck will perform the action set here.
     *
     * Please note, display is abstract, so it could be implemented for every class, also this is the
     * reason why this class is abstract.
     *
     * --now move to classes that extend Duck.
     */

    FlyBehavior flyBehavior;
    QuackBehavoir quackBehavoir;

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavoir(QuackBehavoir qb){
        quackBehavoir = qb;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavoir.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
