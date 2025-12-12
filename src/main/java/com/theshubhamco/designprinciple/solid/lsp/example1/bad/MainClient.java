package com.theshubhamco.designprinciple.solid.lsp.example1.bad;

import com.theshubhamco.designprinciple.solid.lsp.example1.bad.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.lsp.example1.bad.model.*;
import com.theshubhamco.designprinciple.solid.lsp.example1.bad.persistence.EmployeeFilePersistenceStrategy;
import com.theshubhamco.designprinciple.solid.lsp.example1.bad.salary.SalaryCalculator;
import com.theshubhamco.designprinciple.solid.lsp.example1.bad.service.EmployeeService;

import java.util.logging.Logger;

public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham", 4500, 3000);
        Employee contractEmployee = new ContractEmployee("Ashwarya", 11, 40);
        Employee internEmployee = new InternEmployee("Arvind", 1000);
        Employee commissionedEmployee = new CommissionedEmployee("Rakesh", 3000, 50000, 2);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        EmployeeService employeeService = new EmployeeService(formatter,
                new EmployeeFilePersistenceStrategy("employee.txt"),
                salaryCalculator);

        logger.info("Calculating employee salary...");
        employeeService.calculateSalary(fullTimeEmployee);
        employeeService.calculateSalary(contractEmployee);
        employeeService.calculateSalary(internEmployee);
        employeeService.calculateSalary(commissionedEmployee);
        logger.info("Calculated employee salary");

        logger.info("Calculating deduction...");
        logger.info(String.format("Employee: %s, Type: %s, Deductions: %s",
                fullTimeEmployee.getName(),
                fullTimeEmployee.getType(),
                fullTimeEmployee.calculateDeduction(2)));
        logger.info(String.format("Employee: %s, Type: %s, Deductions: %s",
                contractEmployee.getName(),
                contractEmployee.getType(),
                contractEmployee.calculateDeduction(0)));
        logger.info(String.format("Employee: %s, Type: %s, Deductions: %s",
                commissionedEmployee.getName(),
                commissionedEmployee.getType(),
                commissionedEmployee.calculateDeduction(0)));
        logger.info(String.format("Employee: %s, Type: %s, Deductions: %s",
                internEmployee.getName(),
                internEmployee.getType(),
                internEmployee.calculateDeduction(0)));
        logger.info("Calculated deduction");
    }
}
