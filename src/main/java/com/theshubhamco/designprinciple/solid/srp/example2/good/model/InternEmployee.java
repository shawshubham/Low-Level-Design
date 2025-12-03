package com.theshubhamco.designprinciple.solid.srp.example2.good.model;

public class InternEmployee extends Employee {
    public InternEmployee(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Intern";
    }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}