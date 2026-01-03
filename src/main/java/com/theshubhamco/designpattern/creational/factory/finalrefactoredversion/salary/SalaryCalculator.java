package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.salary;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        SalaryCalculationStrategy strategy = SalaryStrategyFactory
                .getSalaryCalculationStrategy(employee.getType());
        return strategy.calculate(employee);
    }
}

