package com.theshubhamco.designpattern.creational.builder.stagedbuilder.operation;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
