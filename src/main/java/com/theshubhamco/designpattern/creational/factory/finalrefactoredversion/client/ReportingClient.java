package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.client;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;
import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public String generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
