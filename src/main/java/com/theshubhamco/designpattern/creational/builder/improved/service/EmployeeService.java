package com.theshubhamco.designpattern.creational.builder.improved.service;

import com.theshubhamco.designpattern.creational.builder.improved.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.improved.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;
import com.theshubhamco.designpattern.creational.builder.improved.operation.HROperations;
import com.theshubhamco.designpattern.creational.builder.improved.operation.ITAdminOperations;
import com.theshubhamco.designpattern.creational.builder.improved.operation.PayrollOperations;
import com.theshubhamco.designpattern.creational.builder.improved.operation.ReportingOperations;
import com.theshubhamco.designpattern.creational.builder.improved.persistence.EmployeePersistenceStrategy;
import com.theshubhamco.designpattern.creational.builder.improved.salary.SalaryCalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeService implements
        HROperations,
        PayrollOperations,
        ITAdminOperations,
        ReportingOperations {
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
    public double calculateDeduction(Employee employee) {
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
    public EmployeeReport generateReport(Employee employee) {
        //generate report based on employee, returning dummy report for now
        EmployeeReport report =  new EmployeeReport.Builder()
                .name(employee.getName())
                .type(employee.getType())
                .department(employee.getDepartment())
                .salary(calculateSalary(employee))
                .deduction(calculateDeduction(employee))
                .build();

        return report;
    }
}
