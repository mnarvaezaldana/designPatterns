package com.yucatancorp.strategy.bestApproach;

public class EmployeeConsumer {

    private IEmployee iEmployee;

    public EmployeeConsumer(IEmployee employee){
        this.iEmployee = employee;
    }

    public void setiEmployee(IEmployee iEmployee){
        this.iEmployee = iEmployee;
    }

    public void performTask() {
        this.iEmployee.performTask();
    }
}
