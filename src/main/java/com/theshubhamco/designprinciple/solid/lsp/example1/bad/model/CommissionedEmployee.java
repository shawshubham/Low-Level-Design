package com.theshubhamco.designprinciple.solid.lsp.example1.bad.model;

public class CommissionedEmployee extends Employee {
    private final double baseSalary;
    private final double monthlySales;
    private final int complianceBreach;

    public CommissionedEmployee(String name, double baseSalary, double monthlySales, int complianceBreach) {
        super(name);
        this.baseSalary = baseSalary;
        this.monthlySales = monthlySales;
        this.complianceBreach = complianceBreach;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.COMMISSIONED;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    @Override
    public double calculateDeduction(int daysAbsent) {
        //assuming 10% number of compliance breach, ignoring the daysAbsent
        return Math.max(0, complianceBreach * 0.1);
    }
}
