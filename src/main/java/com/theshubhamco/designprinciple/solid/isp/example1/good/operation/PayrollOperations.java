package com.theshubhamco.designprinciple.solid.isp.example1.good.operation;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public interface PayrollOperations {
    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);
}
