package com.theshubhamco.designprinciple.solid.ocp.example2.good.salary;

import com.theshubhamco.designprinciple.solid.ocp.example2.good.model.Employee;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        SalaryCalculationStrategy strategy = SalaryStrategyFactory
                .getSalaryCalculationStrategy(employee.getType());
        return strategy.calculate(employee);
    }
}

