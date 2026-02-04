package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
