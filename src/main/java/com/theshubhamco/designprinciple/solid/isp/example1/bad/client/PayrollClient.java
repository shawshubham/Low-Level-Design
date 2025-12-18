package com.theshubhamco.designprinciple.solid.isp.example1.bad.client;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.service.EmployeeOperations;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PayrollClient {
    private static final Logger logger = Logger.getLogger(PayrollClient.class.getName());
    private final EmployeeOperations employeeOperations;

    public PayrollClient(EmployeeOperations employeeOperations) {
        this.employeeOperations = employeeOperations;
    }

    public void runPayroll(Employee employeeData) {
        logger.log(Level.INFO, "Processing payroll for employee {0}", employeeData);
        // Payroll processing logic using employeeOperations
        employeeOperations.calculateSalary(employeeData);
        employeeOperations.calculateDeduction(employeeData);
        logger.log(Level.INFO, "Processed payroll for employee {0}", employeeData);
    }
}
