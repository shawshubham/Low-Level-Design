package com.theshubhamco.designprinciple.solid.srp.finalrefactoredversion.model;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name) {
        super(name);
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.CONTRACT;
    }
}
