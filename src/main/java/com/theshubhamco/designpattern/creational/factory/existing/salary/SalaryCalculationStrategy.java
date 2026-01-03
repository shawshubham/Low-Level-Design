package com.theshubhamco.designpattern.creational.factory.existing.salary;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
