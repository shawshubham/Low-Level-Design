package com.theshubhamco.designprinciple.solid.isp.example1.good.client;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.good.operation.PayrollOperations;
import com.theshubhamco.designprinciple.solid.isp.example1.good.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public String generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
