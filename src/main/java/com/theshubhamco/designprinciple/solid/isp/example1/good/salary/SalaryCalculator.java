package com.theshubhamco.designprinciple.solid.isp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        SalaryCalculationStrategy strategy = SalaryStrategyFactory
                .getSalaryCalculationStrategy(employee.getType());
        return strategy.calculate(employee);
    }
}

