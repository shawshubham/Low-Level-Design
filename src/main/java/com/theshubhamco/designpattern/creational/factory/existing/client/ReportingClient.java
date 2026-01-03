package com.theshubhamco.designpattern.creational.factory.existing.client;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;
import com.theshubhamco.designpattern.creational.factory.existing.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public String generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
