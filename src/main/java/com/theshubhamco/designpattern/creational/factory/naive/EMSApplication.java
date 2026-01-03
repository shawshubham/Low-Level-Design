package com.theshubhamco.designpattern.creational.factory.naive;

import com.theshubhamco.designpattern.creational.factory.naive.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.factory.naive.model.*;
import com.theshubhamco.designpattern.creational.factory.naive.persistence.EmployeePersistenceFactory;
import com.theshubhamco.designpattern.creational.factory.naive.persistence.EmployeePersistenceStrategy;
import com.theshubhamco.designpattern.creational.factory.naive.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.factory.naive.service.EmployeeService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EMSApplication {
    private static final Logger logger = Logger.getLogger(EMSApplication.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham", 4500, 3000, 5);
        Employee contractEmployee = new ContractEmployee("Ashwarya", 11, 40);
        Employee internEmployee = new InternEmployee("Arvind", 1000);
        Employee commissionedEmployee = new CommissionedEmployee("Rakesh", 3000, 50000, 2);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        EmployeePersistenceStrategy persistenceStrategy =
                EmployeePersistenceFactory.create("file");

        EmployeeService employeeService = new EmployeeService(formatter, persistenceStrategy, salaryCalculator);

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
    }
}
