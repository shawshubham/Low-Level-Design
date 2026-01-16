package com.theshubhamco.designpattern.creational.builder.naive.salary;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
