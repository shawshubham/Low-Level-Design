package com.theshubhamco.designpattern.creational.builder.tobuilderexample.salary;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
