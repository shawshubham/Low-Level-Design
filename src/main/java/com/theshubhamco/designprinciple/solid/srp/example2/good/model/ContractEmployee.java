package com.theshubhamco.designprinciple.solid.srp.example2.good.model;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Contract";
    }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}