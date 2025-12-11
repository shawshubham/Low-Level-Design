package com.theshubhamco.designprinciple.solid.ocp.example2.good.model;

public class ContractEmployee extends Employee {
    private final int hourlyRate;
    private final int hoursWorked;

    public ContractEmployee(String name, int hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.CONTRACT;
    }

    public int getHourlyRate() { return hourlyRate; }

    public int getHoursWorked() { return hoursWorked; }
}
