package com.theshubhamco.designprinciple.solid.lsp.example1.good.model;

import com.theshubhamco.designprinciple.solid.lsp.example1.good.deduction.InternDeductionPolicy;

public class InternEmployee extends Employee {
    private final double stipend;

    public InternEmployee(String name, double stipend) {
        super(name, new InternDeductionPolicy());
        this.stipend = stipend;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.INTERN;
    }

    public double getStipend() { return stipend; }
}
