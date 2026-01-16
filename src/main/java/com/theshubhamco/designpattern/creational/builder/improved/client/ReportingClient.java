package com.theshubhamco.designpattern.creational.builder.improved.client;

import com.theshubhamco.designpattern.creational.builder.improved.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;
import com.theshubhamco.designpattern.creational.builder.improved.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public EmployeeReport generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
