package com.theshubhamco.designpattern.creational.factory.improved.salary;

import com.theshubhamco.designpattern.creational.factory.improved.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
