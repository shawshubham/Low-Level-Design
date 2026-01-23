package com.theshubhamco.designpattern.creational.abstractfactory.naive.operation;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
