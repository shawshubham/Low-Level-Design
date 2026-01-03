package com.theshubhamco.designpattern.creational.factory.naive.operation;

import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
