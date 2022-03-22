package com.yucatancorp.strategy.exampleFromBook;

public class KnifeWeapon implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("The warrior that uses this weapon is fast!");
    }

}
