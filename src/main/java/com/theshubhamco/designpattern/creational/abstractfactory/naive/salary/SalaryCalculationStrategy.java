package com.theshubhamco.designpattern.creational.abstractfactory.naive.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
