package com.theshubhamco.designpattern.creational.builder.tobuilderexample.model;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.deduction.InternDeductionPolicy;

public class InternEmployee extends Employee {
    private final double stipend;

    public InternEmployee(String name,
                          Department department,
                          double stipend) {
        super(name, department, new InternDeductionPolicy());
        this.stipend = stipend;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.INTERN;
    }

    public double getStipend() { return stipend; }
}
