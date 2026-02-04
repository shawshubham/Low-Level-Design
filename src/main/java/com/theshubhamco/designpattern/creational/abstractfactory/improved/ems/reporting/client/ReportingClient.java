package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.client;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle.EmailLinkBundleFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle.ReportBundleFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportReportRequest;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.api.ReportingOperations;

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
