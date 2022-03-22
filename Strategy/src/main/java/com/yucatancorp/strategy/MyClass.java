package com.yucatancorp.strategy;

import com.yucatancorp.strategy.bestApproach.Accountant;
import com.yucatancorp.strategy.bestApproach.EmployeeConsumer;
import com.yucatancorp.strategy.bestApproach.Engineer;
import com.yucatancorp.strategy.bestApproach.Fireman;
import com.yucatancorp.strategy.bestApproach.Teacher;
import com.yucatancorp.strategy.exampleFromBook.AxeBehavior;
import com.yucatancorp.strategy.exampleFromBook.Character;
import com.yucatancorp.strategy.exampleFromBook.Queen;
import com.yucatancorp.strategy.rigthBookAproach.Duck;
import com.yucatancorp.strategy.rigthBookAproach.FlyWithARocket;
import com.yucatancorp.strategy.rigthBookAproach.MallarDuck;
import com.yucatancorp.strategy.rigthBookAproach.ModelDuck;
import com.yucatancorp.strategy.rigthBookAproach.Squack;
import com.yucatancorp.strategy.wrongApproach.WrongApproachClass;

public class MyClass {

    public static void main(String[] args) {
        usingRightApproach();
        System.out.println();
        usingWrongApproach();
        System.out.println();
        rightBookApproach();
        System.out.println("***************************");
        System.out.println("************  Now using setters ***************");
        System.out.println();
        rightBookApproachWithSetters();
        System.out.println("***************************");
        System.out.println("************  Books's exercise ***************");
        System.out.println();
        exampleFromBook();
    }

    private static void exampleFromBook() {
        Character queen = new Queen();
        queen.fight();
        queen.useWeapon();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.useWeapon();
    }

    private static void rightBookApproachWithSetters() {
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.setFlyBehavior(new FlyWithARocket());
        modelDuck.setQuackBehavoir(new Squack());
        modelDuck.performFly();
        modelDuck.performQuack();
    }

    private static void rightBookApproach() {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();
    }

    private static void usingWrongApproach() {
        WrongApproachClass myFirstWrongApproachClass = new WrongApproachClass("teacher");
        WrongApproachClass mySecondWrongApproachClass = new WrongApproachClass("fireman");
        WrongApproachClass myThirdWrongApproachClass = new WrongApproachClass("accountant");
        WrongApproachClass myFourthWrongApproachClass = new WrongApproachClass("engineer");
    }

    private static void usingRightApproach() {
        EmployeeConsumer employeeConsumer = new EmployeeConsumer(new Teacher());
        employeeConsumer.performTask();
        employeeConsumer.setiEmployee(new Accountant());
        employeeConsumer.performTask();
        employeeConsumer.setiEmployee(new Engineer());
        employeeConsumer.performTask();
        employeeConsumer.setiEmployee(new Fireman());
        employeeConsumer.performTask();
    }
}