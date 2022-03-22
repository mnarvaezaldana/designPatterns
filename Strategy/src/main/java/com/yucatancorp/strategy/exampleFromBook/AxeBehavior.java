package com.yucatancorp.strategy.exampleFromBook;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("The warrior that uses this weapon is slow, but powerful");
    }
}
