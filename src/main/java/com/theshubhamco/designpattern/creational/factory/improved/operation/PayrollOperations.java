package com.theshubhamco.designpattern.creational.factory.improved.operation;

import com.theshubhamco.designpattern.creational.factory.improved.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
