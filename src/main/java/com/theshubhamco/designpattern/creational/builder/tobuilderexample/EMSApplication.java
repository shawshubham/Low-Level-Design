package com.theshubhamco.designpattern.creational.builder.tobuilderexample;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.client.ReportingClient;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.*;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.persistence.EmployeePersistenceFactory;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.persistence.PersistenceType;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.service.EmployeeService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EMSApplication {
    private static final Logger logger = Logger.getLogger(EMSApplication.class.getName());
    private static final String persistenceFileName = "employees.txt";

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham",
                Department.ENGINEERING,4500, 3000, 5);
        Employee contractEmployee = new ContractEmployee("Ashwarya",
                Department.ACCOUNTING, 11, 40);
        Employee internEmployee = new InternEmployee("Arvind",
                Department.ENGINEERING,1000);
        Employee commissionedEmployee = new CommissionedEmployee("Rakesh",
                Department.ENGINEERING,3000, 50000, 2);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        EmployeePersistenceFactory persistenceFactory = new EmployeePersistenceFactory(persistenceFileName);

        EmployeeService employeeService = new EmployeeService(formatter,
                persistenceFactory.create(PersistenceType.FILE),
                salaryCalculator);

        ReportingClient reportingClient = new ReportingClient(employeeService);

        logger.info("adding employees...");
        employeeService.addEmployee(fullTimeEmployee);
        employeeService.addEmployee(contractEmployee);
        employeeService.addEmployee(internEmployee);
        logger.info("added employees.");

        logger.log(Level.INFO, "Calculating employee salary...");
        employeeService.calculateSalary(fullTimeEmployee);
        employeeService.calculateSalary(contractEmployee);
        employeeService.calculateSalary(internEmployee);
        employeeService.calculateSalary(commissionedEmployee);
        logger.log(Level.INFO, "Calculated employee salary");

        logger.log(Level.INFO, "Calculating deduction...");
        employeeService.calculateDeduction(fullTimeEmployee);
        employeeService.calculateDeduction(contractEmployee);
        employeeService.calculateDeduction(internEmployee);
        employeeService.calculateDeduction(commissionedEmployee);
        logger.log(Level.INFO, "Calculated deduction");

        logger.log(Level.INFO, "Generating EmployeeReport for the provided employee...");
        reportingClient.generateReport(fullTimeEmployee);
        logger.log(Level.INFO, "Done with EmployeeReport generation.");
    }
}
