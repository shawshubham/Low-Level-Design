package com.theshubhamco.designprinciple.solid.isp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public interface SalaryCalculationStrategy {
    double calculate(Employee employee);
}
