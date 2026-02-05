package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.client;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.api.ReportingOperations;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportReportRequest;

public class ReportingClient {
    private final ReportingOperations reportingOperations;

    public ReportingClient(ReportingOperations reportingOperations) {
        this.reportingOperations = reportingOperations;
    }

    public EmployeeReport generateReport(Employee employeeData) {
        return reportingOperations.generateReport(employeeData);
    }

    public void exportReport(Employee employeeData, ExportReportRequest request) {
        reportingOperations.exportReport(employeeData, request);
    }
}
