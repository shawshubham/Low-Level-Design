package com.theshubhamco.designpattern.creational.builder.improved.operation;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
