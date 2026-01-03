package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.deduction;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.ContractEmployee;
import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

import static com.theshubhamco.designprinciple.solid.lsp.example1.good.model.ContractEmployee.MAX_WORK_TIME;

public class ContractDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        ContractEmployee contractEmployee = (ContractEmployee) employee;
        double missingHours = MAX_WORK_TIME - contractEmployee.getHoursWorked();
        return missingHours > 0 ? missingHours * 5 : 0;
    }
}
