package com.theshubhamco.designprinciple.solid.isp.example1.bad;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.*;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.persistence.EmployeeFilePersistenceStrategy;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.salary.SalaryCalculator;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.service.EmployeeService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham", 4500, 3000, 5);
        Employee contractEmployee = new ContractEmployee("Ashwarya", 11, 40);
        Employee internEmployee = new InternEmployee("Arvind", 1000);
        Employee commissionedEmployee = new CommissionedEmployee("Rakesh", 3000, 50000, 2);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        EmployeeService employeeService = new EmployeeService(formatter,
                new EmployeeFilePersistenceStrategy("employee.txt"),
                salaryCalculator);

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
