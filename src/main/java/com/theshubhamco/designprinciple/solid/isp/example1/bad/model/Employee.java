package com.theshubhamco.designprinciple.solid.isp.example1.bad.model;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.deduction.DeductionPolicy;

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
