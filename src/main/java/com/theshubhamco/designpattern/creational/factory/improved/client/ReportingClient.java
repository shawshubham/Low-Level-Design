package com.theshubhamco.designpattern.creational.factory.improved.client;

import com.theshubhamco.designpattern.creational.factory.improved.model.Employee;
import com.theshubhamco.designpattern.creational.factory.improved.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public String generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
