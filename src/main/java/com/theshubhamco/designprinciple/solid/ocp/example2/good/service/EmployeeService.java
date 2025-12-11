package com.theshubhamco.designprinciple.solid.ocp.example2.good.service;

import com.theshubhamco.designprinciple.solid.ocp.example2.good.businesslogic.SalaryCalculator;
import com.theshubhamco.designprinciple.solid.ocp.example2.good.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.ocp.example2.good.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example2.good.persistence.EmployeePersistenceStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeService {
    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

    private final EmployeeFormatter employeeFormatter;
    private final EmployeePersistenceStrategy persistenceStrategy;
    private final SalaryCalculator salaryCalculator;

    public EmployeeService(EmployeeFormatter employeeFormatter,
                           EmployeePersistenceStrategy persistenceStrategy, SalaryCalculator salaryCalculator) {
        this.employeeFormatter = employeeFormatter;
        this.persistenceStrategy = persistenceStrategy;
        this.salaryCalculator = salaryCalculator;
    }

    public void save(Employee employee) {
        String formatted = employeeFormatter.formatForHR(employee);
        persistenceStrategy.save(formatted);
        logger.log(Level.INFO, "Saved employee {0}", employee);
    }

    public double calculateSalary(Employee employee) {
        double salary = salaryCalculator.calculate(employee);
        logger.log(Level.INFO, String.format("Name: %s , Type: %s, Salary: %s", employee.getName(), employee.getType(), salary));
        return salary;
    }
}
