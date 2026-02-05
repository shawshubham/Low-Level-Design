package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.service;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.payroll.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.api.ReportingOperations;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.bundle.EmailLinkBundleFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.bundle.ReportBundleFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.bundle.ReportBundleFactoryProvider;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.*;

import java.util.logging.Logger;

public class ReportingOperationsService implements ReportingOperations {
    private static final Logger logger = Logger.getLogger(ReportingOperationsService.class.getName());
    private final SalaryCalculator salaryCalculator;

    public ReportingOperationsService(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public EmployeeReport generateReport(Employee employee) {
        logger.info("Generating report for " + employee.getName());

        //generate report based on employee, returning dummy report for now
        return new EmployeeReport.Builder()
                .name(employee.getName())
                .type(employee.getType())
                .department(employee.getDepartment())
                .salary(salaryCalculator.calculate(employee))
                .deductions(employee.calculateDeduction())
                .build();
    }

    @Override
    public void exportReport(Employee employeeData, ExportReportRequest request) {

        logger.info("Exporting report for " + employeeData.getName());
        ReportBundleFactory bundle = ReportBundleFactoryProvider.getBundleFactory(request);

        // 1) Generate Report (Domain)
        EmployeeReport report = generateReport(employeeData);

        // 2 + 3) Layout/Template + Export (format-specific)
        ExportedReport exportedReport =  bundle.createExportStrategy().export(report);

        // 4) Delivery Channel-Specific Logic
        DeliveryResult deliveryResult = switch (request) {
            case PortalDownloadRequest r ->
                bundle.createDeliveryStrategy().deliver(exportedReport, r.downloadPath());
            case EmailAttachmentRequest r ->
                bundle.createDeliveryStrategy().deliver(exportedReport, r.email());
            case EmailLinkRequest r ->
                bundle.createDeliveryStrategy().deliver(exportedReport, r.email());
        };

        // 5) Notification Logic (Optional)
        switch (request) {
            case EmailLinkRequest r ->
                    bundle.createNotificationStrategy()
                            .ifPresent(strategy -> strategy.notifyUser(deliveryResult, r.phone()));
            default ->
                bundle.createNotificationStrategy()
                        .ifPresent(strategy -> strategy.notifyUser(deliveryResult, null));
        }

        logger.info("Report exported successfully");
    }
}