package com.theshubhamco.designpattern.creational.builder.naive.operation;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
