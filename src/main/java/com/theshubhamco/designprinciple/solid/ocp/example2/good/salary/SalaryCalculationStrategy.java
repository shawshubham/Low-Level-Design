package com.theshubhamco.designprinciple.solid.ocp.example2.good.salary;

import com.theshubhamco.designprinciple.solid.ocp.example2.good.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
