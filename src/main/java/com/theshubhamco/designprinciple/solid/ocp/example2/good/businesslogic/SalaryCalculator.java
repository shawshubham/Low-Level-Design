package com.theshubhamco.designprinciple.solid.ocp.example2.good.businesslogic;

import com.theshubhamco.designprinciple.solid.ocp.example2.good.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example2.good.salarycalculator.SalaryCalculationStrategy;
import com.theshubhamco.designprinciple.solid.ocp.example2.good.strategyfactory.SalaryStrategyFactory;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        SalaryCalculationStrategy strategy = SalaryStrategyFactory
                .getSalaryCalculationStrategy(employee.getType());
        return strategy.calculate(employee);
    }
}

