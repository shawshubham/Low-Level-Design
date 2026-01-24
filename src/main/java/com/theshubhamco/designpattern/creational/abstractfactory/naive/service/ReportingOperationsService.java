package com.theshubhamco.designpattern.creational.abstractfactory.naive.service;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.*;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery.DeliveryStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.export.ReportExportStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.notification.NotificationStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.notification.NotificationStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.operation.ReportingOperations;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.salary.SalaryCalculator;

public class ReportingOperationsService implements ReportingOperations {
    private SalaryCalculator salaryCalculator;

    public ReportingOperationsService(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public EmployeeReport generateReport(Employee employee) {
        //generate report based on employee, returning dummy report for now
        EmployeeReport report =  new EmployeeReport.Builder()
                .name(employee.getName())
                .type(employee.getType())
                .department(employee.getDepartment())
                .salary(salaryCalculator.calculate(employee))
                .deduction(employee.calculateDeduction())
                .build();

        return report;
    }

    @Override
    public void exportReport(Employee employeeData, ExportReportRequest request) {
        // 1) Generate Report (Domain)
        EmployeeReport report = generateReport(employeeData);

        // 2 + 3) Layout/Template + Export (format-specific)
        ReportExportStrategy reportExportStrategy = ReportExportStrategyFactory.getStrategy(request.getFormat());
        ExportedReport exportedReport =  reportExportStrategy.export(report);

        // 4) Delivery Channel-Specific Logic
        DeliveryStrategy deliveryStrategy = DeliveryStrategyFactory.getStrategy(request.getDeliveryChannel());
        DeliveryResult deliveryResult = deliveryStrategy.deliver(exportedReport, request.getDeliveryAddress());

        // 5) Notification Logic (Optional)
        NotificationType notificationType = request.getNotificationType();
        if (notificationType != null) {
            NotificationStrategy notificationStrategy = NotificationStrategyFactory.getStrategy(notificationType);
            notificationStrategy.notifyUser(deliveryResult, request.getNotificationTarget());
        }
    }
}
