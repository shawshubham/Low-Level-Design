package com.theshubhamco.designprinciple.solid.lsp.example1.bad.model;

public class InternEmployee extends Employee {
    private final double stipend;

    public InternEmployee(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.INTERN;
    }

    public double getStipend() { return stipend; }

    @Override
    public double calculateDeduction(int daysAbsent) {
        throw new UnsupportedOperationException("Interns do not have deductions.");
    }
}
