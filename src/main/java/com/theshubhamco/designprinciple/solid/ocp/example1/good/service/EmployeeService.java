package com.theshubhamco.designprinciple.solid.ocp.example1.good.service;

import com.theshubhamco.designprinciple.solid.ocp.example1.good.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.persistence.EmployeePersistenceStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeService {
    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

    private final EmployeeFormatter employeeFormatter;
    private final EmployeePersistenceStrategy persistenceStrategy;

    public EmployeeService(EmployeeFormatter employeeFormatter,
                           EmployeePersistenceStrategy persistenceStrategy) {
        this.employeeFormatter = employeeFormatter;
        this.persistenceStrategy = persistenceStrategy;
    }

    public void save(Employee employee) {
        String formatted = employeeFormatter.formatForHR(employee);
        persistenceStrategy.save(formatted);
        logger.log(Level.INFO, "Saved employee {0}", employee);
    }
}
