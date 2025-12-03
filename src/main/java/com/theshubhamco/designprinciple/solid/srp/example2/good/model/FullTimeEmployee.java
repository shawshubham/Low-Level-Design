package com.theshubhamco.designprinciple.solid.srp.example2.good.model;

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
