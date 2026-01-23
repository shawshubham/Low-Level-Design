package com.theshubhamco.designpattern.creational.abstractfactory.naive.model;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.deduction.DeductionPolicy;

public abstract class Employee {
    private final String name;
    private final Department department;
    private final DeductionPolicy deductionPolicy;

    public Employee(String name, Department department, DeductionPolicy deductionPolicy) {
        this.name = name;
        this.department = department;
        this.deductionPolicy = deductionPolicy;
    }

    public String getName() {
        return name;
    }
    public Department getDepartment() {return department;}

    public abstract EmployeeType getType();

    public double calculateDeduction(){
        return deductionPolicy.calculateDeduction(this);
    }
}
