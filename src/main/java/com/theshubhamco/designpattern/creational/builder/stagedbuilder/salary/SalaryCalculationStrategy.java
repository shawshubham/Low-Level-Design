package com.theshubhamco.designpattern.creational.builder.stagedbuilder.salary;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
