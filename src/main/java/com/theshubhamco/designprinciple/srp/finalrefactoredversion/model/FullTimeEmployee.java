package com.theshubhamco.designprinciple.srp.finalrefactoredversion.model;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.FULL_TIME;
    }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}
