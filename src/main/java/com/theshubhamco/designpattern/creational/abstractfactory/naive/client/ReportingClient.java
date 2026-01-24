package com.theshubhamco.designpattern.creational.abstractfactory.naive.client;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.*;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.export.PdfReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.notification.NotificationStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.operation.ReportingOperations;

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
