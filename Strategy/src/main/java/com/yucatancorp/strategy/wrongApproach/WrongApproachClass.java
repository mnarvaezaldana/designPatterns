package com.yucatancorp.strategy.wrongApproach;

public class WrongApproachClass {

    public WrongApproachClass(String jobName){
        switch (jobName) {
            case "teacher" : { teacherAlgorithm(); }
            break;
            case "fireman" : { firemanAlgorithm(); }
            break;
            case "accountant" : { accountantAlgorithm(); }
            break;
            case "engineer" : { engineerAlgorithm(); }
            break;
            default: {System.out.println("default value found");}
        }
    }

    private void teacherAlgorithm(){
        System.out.println("Teaches some lessons for the kids");
    }

    private void firemanAlgorithm(){
        System.out.println("Fireman fights against fire");
    }

    private void accountantAlgorithm(){
        System.out.println("Check the numbers in the bank");
    }

    private void engineerAlgorithm(){
        System.out.println("Write some code in Java");
    }
}
