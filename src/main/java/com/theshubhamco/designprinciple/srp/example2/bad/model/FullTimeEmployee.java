package com.theshubhamco.designprinciple.srp.example2.bad.model;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "FullTime";
    }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}
