package com.theshubhamco.designprinciple.solid.lsp.example1.bad.salary;

import com.theshubhamco.designprinciple.solid.lsp.example1.bad.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
