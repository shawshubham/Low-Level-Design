package com.theshubhamco.designpattern.creational.abstractfactory.naive.client;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.operation.ReportingOperations;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public EmployeeReport generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }
}
