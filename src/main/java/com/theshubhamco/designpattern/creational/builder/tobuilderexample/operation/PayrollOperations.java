package com.theshubhamco.designpattern.creational.builder.tobuilderexample.operation;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
