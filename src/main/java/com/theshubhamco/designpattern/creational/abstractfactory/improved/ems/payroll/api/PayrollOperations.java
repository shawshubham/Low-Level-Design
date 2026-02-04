package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.api;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
