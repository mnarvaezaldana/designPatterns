package com.yucatancorp.strategy.rigthBookAproach;

public class MuteQuack implements QuackBehavoir{
    @Override
    public void quack() {
        System.out.println("This Quack doesn't sound because it is a mute quack");
    }
}
