package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.service;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.api.ReportingOperations;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle.ReportBundleFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle.ReportBundleFactoryProvider;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportReportRequest;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportedReport;

import java.util.logging.Logger;

public class ReportingOperationsService implements ReportingOperations {
    private static final Logger logger = Logger.getLogger(ReportingOperationsService.class.getName());
    private SalaryCalculator salaryCalculator;

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
        ReportBundleFactory bundleFactory = ReportBundleFactoryProvider.getBundleFactory(request);

        // 1) Generate Report (Domain)
        EmployeeReport report = generateReport(employeeData);

        // 2 + 3) Layout/Template + Export (format-specific)
        ExportedReport exportedReport =  bundleFactory.createExportStrategy().export(report);

        // 4) Delivery Channel-Specific Logic
        DeliveryResult deliveryResult = bundleFactory.createDeliveryStrategy().deliver(exportedReport, request.getDeliveryAddress());

        // 5) Notification Logic (Optional)
        bundleFactory.createNotificationStrategy()
                .ifPresent(strategy ->
                        strategy.notifyUser(deliveryResult, request.getNotificationTarget()));

        logger.info("Report exported successfully");
    }
}