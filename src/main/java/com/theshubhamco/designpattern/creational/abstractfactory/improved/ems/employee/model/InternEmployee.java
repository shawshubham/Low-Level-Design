package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.deduction.InternDeductionPolicy;

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
