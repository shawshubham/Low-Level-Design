package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.payroll.api;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
