package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.operation;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
