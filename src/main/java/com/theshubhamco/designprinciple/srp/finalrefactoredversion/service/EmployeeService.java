package com.theshubhamco.designprinciple.srp.finalrefactoredversion.service;

import com.theshubhamco.designprinciple.srp.finalrefactoredversion.model.Employee;

import java.io.IOException;
import java.util.logging.Logger;

public class EmployeeService {
    private static Logger logger = Logger.getLogger(EmployeeService.class.getName());

    private EmployeeFormatter employeeFormatter;
    private EmployeeFileSaver employeeFileSaver;

    public EmployeeService(EmployeeFormatter employeeFormatter, EmployeeFileSaver employeeFileSaver) {
        this.employeeFormatter = employeeFormatter;
        this.employeeFileSaver = employeeFileSaver;
    }

    public void save(Employee employee) {
        String formatted = employeeFormatter.formatForHR(employee);
        try {
            employeeFileSaver.saveToFile(formatted);
        } catch (IOException e) {
            logger.severe("Error saving employee data: " + e.getMessage());
            // optionally re-throw or handle differently in production
        }
    }
}
