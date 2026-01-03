package com.theshubhamco.designpattern.creational.factory.existing;

import com.theshubhamco.designpattern.creational.factory.existing.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.factory.existing.model.*;
import com.theshubhamco.designpattern.creational.factory.existing.persistence.EmployeeFilePersistenceStrategy;
import com.theshubhamco.designpattern.creational.factory.existing.persistence.EmployeePersistenceStrategy;
import com.theshubhamco.designpattern.creational.factory.existing.salary.SalaryCalculator;
import com.theshubhamco.designpattern.creational.factory.existing.service.EmployeeService;
import com.theshubhamco.designpattern.creational.factory.existing.persistence.EmployeeAPIPersistenceStrategy;
import com.theshubhamco.designpattern.creational.factory.existing.persistence.EmployeeDBPersistenceStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

// Application entry point (composition root)
public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham", 4500, 3000, 5);
        Employee contractEmployee = new ContractEmployee("Ashwarya", 11, 40);
        Employee internEmployee = new InternEmployee("Arvind", 1000);
        Employee commissionedEmployee = new CommissionedEmployee("Rakesh", 3000, 50000, 2);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        /*
        * Choosing the persistence strategy creating the one client needs
        * */
        EmployeePersistenceStrategy persistenceStrategy = new EmployeeFilePersistenceStrategy("employee.txt");
        // EmployeePersistenceStrategy persistenceStrategy = new EmployeeDBPersistenceStrategy();
        // EmployeePersistenceStrategy persistenceStrategy = new EmployeeAPIPersistenceStrategy();

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
