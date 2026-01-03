package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.salary;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
