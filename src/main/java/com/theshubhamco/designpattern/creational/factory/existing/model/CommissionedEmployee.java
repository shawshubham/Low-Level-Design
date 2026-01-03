package com.theshubhamco.designpattern.creational.factory.existing.model;

import com.theshubhamco.designpattern.creational.factory.existing.deduction.CommissionedDeductionPolicy;

public class CommissionedEmployee extends Employee {
    private final double baseSalary;
    private final double monthlySales;
    private final int complianceBreach;

    public CommissionedEmployee(String name, double baseSalary, double monthlySales, int complianceBreach) {
        super(name, new CommissionedDeductionPolicy());
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
    public int getComplianceBreach() {
        return complianceBreach;
    }
}
