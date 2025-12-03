package com.theshubhamco.designprinciple.solid.ocp.example1.bad.model;

public class InternEmployee extends Employee {
    public InternEmployee(String name) {
        super(name);
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.INTERN;
    }
}
