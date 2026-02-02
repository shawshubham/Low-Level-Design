package com.theshubhamco.designpattern.creational.builder.stagedbuilder.salary;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        SalaryCalculationStrategy strategy = SalaryStrategyFactory
                .getSalaryCalculationStrategy(employee.getType());
        return strategy.calculate(employee);
    }
}

