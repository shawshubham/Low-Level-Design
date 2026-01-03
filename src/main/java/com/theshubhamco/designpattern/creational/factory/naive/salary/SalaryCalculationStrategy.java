package com.theshubhamco.designpattern.creational.factory.naive.salary;

import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
