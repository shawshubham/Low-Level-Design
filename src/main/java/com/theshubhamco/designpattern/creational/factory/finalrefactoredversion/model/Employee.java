package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.deduction.DeductionPolicy;

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
