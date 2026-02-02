package com.theshubhamco.designpattern.creational.builder.tobuilderexample.client;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public EmployeeReport generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
