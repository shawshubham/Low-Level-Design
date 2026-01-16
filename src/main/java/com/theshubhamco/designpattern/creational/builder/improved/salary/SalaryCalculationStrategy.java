package com.theshubhamco.designpattern.creational.builder.improved.salary;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
