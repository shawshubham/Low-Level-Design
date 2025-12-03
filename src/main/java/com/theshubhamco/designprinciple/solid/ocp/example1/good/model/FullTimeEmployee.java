package com.theshubhamco.designprinciple.solid.ocp.example1.good.model;

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
