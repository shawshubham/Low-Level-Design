package com.theshubhamco.designpattern.creational.builder.naive.client;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;
import com.theshubhamco.designpattern.creational.builder.naive.operation.PayrollOperations;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PayrollClient {
    private static final Logger logger = Logger.getLogger(PayrollClient.class.getName());
    private final PayrollOperations payrollOperations;

    public PayrollClient(PayrollOperations payrollOperations) {
        this.payrollOperations = payrollOperations;
    }

    public void runPayroll(Employee employeeData) {
        logger.log(Level.INFO, "Processing payroll for employee {0}", employeeData);
        // Payroll processing logic using employeeOperations
        payrollOperations.calculateSalary(employeeData);
        payrollOperations.calculateDeduction(employeeData);
        logger.log(Level.INFO, "Processed payroll for employee {0}", employeeData);
    }
}
