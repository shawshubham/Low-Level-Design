package com.theshubhamco.designpattern.creational.factory.existing.operation;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
