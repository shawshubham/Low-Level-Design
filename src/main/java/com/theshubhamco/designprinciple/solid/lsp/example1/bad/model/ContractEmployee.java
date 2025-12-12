package com.theshubhamco.designprinciple.solid.lsp.example1.bad.model;

public class ContractEmployee extends Employee {
    private final double hourlyRate;
    private final double hoursWorked;
    private final double MAX_WORK_TIME = 40; //40 hours a week

    public ContractEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.CONTRACT;
    }

    public double getHourlyRate() { return hourlyRate; }

    public double getHoursWorked() { return hoursWorked; }

    @Override
    public double calculateDeduction(int daysAbsent) {
        double missingHours = MAX_WORK_TIME - hoursWorked;
        return missingHours > 0 ? missingHours * 5 : 0;
    }
}
