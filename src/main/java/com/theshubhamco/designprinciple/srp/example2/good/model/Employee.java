package com.theshubhamco.designprinciple.srp.example2.good.model;

public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public abstract String getType();
}
