package com.theshubhamco.designprinciple.srp.finalrefactoredversion.model;

public class InternEmployee extends Employee {
    public InternEmployee(String name) {
        super(name);
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.INTERN;
    }
}
