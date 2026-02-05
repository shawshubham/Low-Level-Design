package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.hr.service;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.hr.api.HROperations;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.formatter.EmployeeFormatter;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.persistence.EmployeePersistenceStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HROperationsService implements HROperations {

    private static final Logger logger = Logger.getLogger(HROperationsService.class.getName());
    private final EmployeeFormatter employeeFormatter;
    private final EmployeePersistenceStrategy persistenceStrategy;

    public HROperationsService(EmployeeFormatter employeeFormatter,
                               EmployeePersistenceStrategy persistenceStrategy) {
        this.employeeFormatter = employeeFormatter;
        this.persistenceStrategy = persistenceStrategy;
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
}
