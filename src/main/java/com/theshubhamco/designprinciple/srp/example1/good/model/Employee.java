package com.theshubhamco.designprinciple.srp.example1.good.model;

//Pure data holder
public class Employee {
    private String name;
    private String type;

    public Employee(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }
}