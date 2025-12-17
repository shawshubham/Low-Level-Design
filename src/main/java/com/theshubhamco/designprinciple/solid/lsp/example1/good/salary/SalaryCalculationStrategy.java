package com.theshubhamco.designprinciple.solid.lsp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
