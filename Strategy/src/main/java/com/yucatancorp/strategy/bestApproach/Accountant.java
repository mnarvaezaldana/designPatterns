package com.yucatancorp.strategy.bestApproach;

public class Accountant implements IEmployee {
    @Override
    public void performTask() {
        System.out.println("Check the balance in the bank");
    }
}
