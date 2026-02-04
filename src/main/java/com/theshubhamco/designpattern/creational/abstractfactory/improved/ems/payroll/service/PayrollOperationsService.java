package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.service;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.api.PayrollOperations;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary.SalaryCalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PayrollOperationsService implements PayrollOperations {
    private static final Logger logger = Logger.getLogger(PayrollOperationsService.class.getName());
    private final SalaryCalculator salaryCalculator;

    public PayrollOperationsService(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public double calculateSalary(Employee employee) {
        double salary = salaryCalculator.calculate(employee);
        logger.log(Level.INFO, String.format("Name: %s , Type: %s, Salary: %s",
                employee.getName(), employee.getType(), salary));
        return salary;
    }

    @Override
    public double calculateDeduction(Employee employee) {
        double salaryDeduction = employee.calculateDeduction();
        logger.log(Level.INFO, String.format("Name: %s, Type: %s, Deductions: %s",
                employee.getName(), employee.getType(), salaryDeduction));
        return salaryDeduction;
    }
}
