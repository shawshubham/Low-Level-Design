package com.theshubhamco.designprinciple.solid.srp.finalrefactoredversion.model;

public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract EmployeeType getType();
}
