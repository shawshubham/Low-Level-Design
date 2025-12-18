package com.theshubhamco.designprinciple.solid.isp.example1.bad.service;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.persistence.EmployeePersistenceStrategy;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.salary.SalaryCalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeService implements EmployeeOperations{
    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

    private final EmployeeFormatter employeeFormatter;
    private final EmployeePersistenceStrategy persistenceStrategy;
    private final SalaryCalculator salaryCalculator;

    public EmployeeService(EmployeeFormatter employeeFormatter,
                           EmployeePersistenceStrategy persistenceStrategy,
                           SalaryCalculator salaryCalculator) {
        this.employeeFormatter = employeeFormatter;
        this.persistenceStrategy = persistenceStrategy;
        this.salaryCalculator = salaryCalculator;
    }

    private void save(Employee employee) {
        String formatted = employeeFormatter.formatForHR(employee);
        persistenceStrategy.save(formatted);
        logger.log(Level.INFO, "Saved employee {0}", employee);
    }

    @Override
    public void addEmployee(Employee employee) {
        //just saving the employee for now
        save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        // let's say we will fetching the employee from source and updating it
        save(employee);
    }

    @Override
    public void markAttendance(Employee employee, int daysPresent) {
        // let's say we are keeping track of attendance in the employee model and writing it over per month
        // we will fetch the employee from source and update it
        save(employee);
    }

    @Override
    public double calculateSalary(Employee employee) {
        double salary = salaryCalculator.calculate(employee);
        logger.log(Level.INFO, String.format("Name: %s , Type: %s, Salary: %s", employee.getName(), employee.getType(), salary));
        return salary;
    }

    @Override
    public double calculateDeduction(Employee employee){
        double salaryDeduction = employee.calculateDeduction();
        logger.log(Level.INFO, String.format("Name: %s, Type: %s, Deductions: %s", employee.getName(), employee.getType(), salaryDeduction));
        return salaryDeduction;
    }

    @Override
    public void provisionSystemAccess(Employee employee, String role, String systemId) {
        //real logic to provision access to system
    }

    @Override
    public void revokeSystemAccess(Employee employee, String role, String systemId) {
        //real logic to revoke access to system
    }

    @Override
    public String generateReport(Employee employee) {
        //generate report based on employee
        return "Employee Report";
    }
}
