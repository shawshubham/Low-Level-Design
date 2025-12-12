package com.theshubhamco.designprinciple.solid.lsp.example1.bad.model;

public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract EmployeeType getType();

    //assumed the default logic
    public double calculateDeduction(int daysAbsent){
        return daysAbsent * 50;
    }
}
