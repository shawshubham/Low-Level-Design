package com.theshubhamco.designprinciple.srp.example2.bad.model;

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