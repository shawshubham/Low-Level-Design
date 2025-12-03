package com.theshubhamco.designprinciple.solid.ocp.example1.bad.model;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name) {
        super(name);
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.CONTRACT;
    }
}
