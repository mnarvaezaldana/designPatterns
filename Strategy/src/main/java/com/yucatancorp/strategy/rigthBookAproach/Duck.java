package com.yucatancorp.strategy.rigthBookAproach;

public abstract class Duck {

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
