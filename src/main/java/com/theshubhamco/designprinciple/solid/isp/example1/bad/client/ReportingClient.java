package com.theshubhamco.designprinciple.solid.isp.example1.bad.client;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.service.EmployeeOperations;

public class ReportingClient {
    private final EmployeeOperations employeeOperations;

    public ReportingClient(EmployeeOperations employeeOperations) {
        this.employeeOperations = employeeOperations;
    }

    public String generateReport(Employee employeeData) {
        return employeeOperations.generateReport(employeeData);
    }
}
