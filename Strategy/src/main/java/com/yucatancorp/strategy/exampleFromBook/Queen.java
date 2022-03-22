package com.yucatancorp.strategy.exampleFromBook;

public class Queen extends Character{

    public Queen(){
        weaponBehavior = new KnifeWeapon();
    }

    @Override
    public void fight() {
        System.out.println("The queen fights elegantly and classy!!");
    }
}
