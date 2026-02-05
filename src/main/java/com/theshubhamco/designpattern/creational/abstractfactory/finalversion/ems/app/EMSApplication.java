package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.app;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.*;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.hr.client.HRClient;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.hr.service.HROperationsService;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.payroll.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.client.ReportingClient;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.*;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.service.ReportingOperationsService;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.persistence.EmployeePersistenceFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.persistence.PersistenceType;

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
                new EmailAttachmentRequest("receiver@gmail.com"));

        reportingClient.exportReport(fullTimeEmployee,
                new PortalDownloadRequest(ExportFormat.PDF,
                        "/path/to/downloads/",
                        "pushtoken"));

        reportingClient.exportReport(fullTimeEmployee,
                new EmailLinkRequest("receiver@email.com", "+44 1234567890"));
        logger.log(Level.INFO, "Report exported successfully.");
    }
}