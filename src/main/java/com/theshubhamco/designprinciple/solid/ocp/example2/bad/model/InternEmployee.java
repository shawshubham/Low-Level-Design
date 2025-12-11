package com.theshubhamco.designprinciple.solid.ocp.example2.bad.model;

public class InternEmployee extends Employee {
    private final int stipend;

    public InternEmployee(String name, int stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.INTERN;
    }

    public int getStipend() { return stipend; }
}
