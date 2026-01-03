package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.deduction.ContractDeductionPolicy;

public class ContractEmployee extends Employee {
    private final double hourlyRate;
    private final double hoursWorked;
    public static final double MAX_WORK_TIME = 160; //40 hours a week

    public ContractEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name, new ContractDeductionPolicy());
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.CONTRACT;
    }

    public double getHourlyRate() { return hourlyRate; }

    public double getHoursWorked() { return hoursWorked; }
}
