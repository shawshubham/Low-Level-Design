package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.app;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.*;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.hr.client.HRClient;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.hr.service.HROperationsService;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.client.ReportingClient;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.*;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.service.ReportingOperationsService;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.shared.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.shared.persistence.EmployeePersistenceFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.shared.persistence.PersistenceType;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EMSApplication {
    private static final Logger logger = Logger.getLogger(EMSApplication.class.getName());
    private static final String persistenceFileName = "employees.txt";

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham", Department.ENGINEERING,4500, 3000, 5);
        Employee contractEmployee = new ContractEmployee("Ashwarya", Department.ACCOUNTING, 11, 40);
        Employee internEmployee = new InternEmployee("Arvind", Department.ENGINEERING, 1000);
        Employee commissionedEmployee = new CommissionedEmployee("Rakesh", Department.ENGINEERING,3000, 50000, 2);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        EmployeePersistenceFactory persistenceFactory = new EmployeePersistenceFactory(persistenceFileName);

        HROperationsService hrOperationsService = new HROperationsService(formatter,
                persistenceFactory.create(PersistenceType.FILE));
        ReportingOperationsService reportingOperationsService = new ReportingOperationsService(salaryCalculator);

        ReportingClient reportingClient = new ReportingClient(reportingOperationsService);
        HRClient hrClient = new HRClient(hrOperationsService);

        logger.info("adding employees...");
        hrClient.addEmployee(fullTimeEmployee);
        hrClient.addEmployee(contractEmployee);
        hrClient.addEmployee(internEmployee);
        hrClient.addEmployee(commissionedEmployee);
        logger.info("added employees.");

        logger.log(Level.INFO, "Client asking to export report of the provided employee...");
        reportingClient.exportReport(fullTimeEmployee,
                new ExportReportRequest(
                        ReportBundleType.EMAIL_ATTACHMENT,
                        ExportFormat.PDF,
                        "receiver@gmail.com",
                        "abc@gmail.com"));

        reportingClient.exportReport(fullTimeEmployee,
                new ExportReportRequest(
                        ReportBundleType.PORTAL_DOWNLOAD,
                        ExportFormat.PDF,
                        "receiver@gmail.com",
                        "abc@gmail.com"));

        reportingClient.exportReport(fullTimeEmployee,
                new ExportReportRequest(
                        ReportBundleType.EMAIL_LINK,
                        ExportFormat.PDF,
                        "receiver@gmail.com",
                        "abc@gmail.com"));
        logger.log(Level.INFO, "Report exported successfully.");
    }
}