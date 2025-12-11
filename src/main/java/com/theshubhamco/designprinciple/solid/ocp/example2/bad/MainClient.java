package com.theshubhamco.designprinciple.solid.ocp.example2.bad;

import com.theshubhamco.designprinciple.solid.ocp.example2.bad.businesslogic.SalaryCalculator;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.FullTimeEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.InternEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.persistence.EmployeeFilePersistenceStrategy;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.service.EmployeeService;

import java.util.logging.Logger;

public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham", 48500, 3000);
        Employee contractEmployee = new ContractEmployee("Ashwarya", 11, 40);
        Employee internEmployee = new InternEmployee("Arvind", 1000);

        EmployeeFormatter formatter = new EmployeeFormatter();
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        EmployeeService employeeService = new EmployeeService(formatter,
                new EmployeeFilePersistenceStrategy("employee.txt"),
                salaryCalculator);

        logger.info("Calculating employee salary...");
        employeeService.calculateSalary(fullTimeEmployee);
        employeeService.calculateSalary(contractEmployee);
        employeeService.calculateSalary(internEmployee);
        logger.info("Calculated employee salary...");
    }
}
