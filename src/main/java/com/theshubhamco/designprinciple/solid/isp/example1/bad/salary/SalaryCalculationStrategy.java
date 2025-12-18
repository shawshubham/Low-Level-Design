package com.theshubhamco.designprinciple.solid.isp.example1.bad.salary;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
