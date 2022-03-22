package com.yucatancorp.strategy.exampleFromBook;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void useWeapon(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
