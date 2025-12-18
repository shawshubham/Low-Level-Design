package com.theshubhamco.designprinciple.solid.isp.example1.good.model;

import com.theshubhamco.designprinciple.solid.isp.example1.good.deduction.DeductionPolicy;

public abstract class Employee {
    private final String name;
    private final DeductionPolicy deductionPolicy;

    public Employee(String name, DeductionPolicy deductionPolicy) {
        this.name = name;
        this.deductionPolicy = deductionPolicy;
    }

    public String getName() {
        return name;
    }

    public abstract EmployeeType getType();

    public double calculateDeduction(){
        return deductionPolicy.calculateDeduction(this);
    }
}
