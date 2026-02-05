package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.payroll.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
