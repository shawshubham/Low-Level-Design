package com.theshubhamco.designpattern.creational.factory.existing.salary;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        SalaryCalculationStrategy strategy = SalaryStrategyFactory
                .getSalaryCalculationStrategy(employee.getType());
        return strategy.calculate(employee);
    }
}

