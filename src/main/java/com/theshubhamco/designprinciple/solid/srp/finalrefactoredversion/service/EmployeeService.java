package com.theshubhamco.designprinciple.solid.srp.finalrefactoredversion.service;

import com.theshubhamco.designprinciple.solid.srp.finalrefactoredversion.model.Employee;

import java.io.IOException;
import java.util.logging.Logger;
import static java.util.logging.Level.SEVERE;

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
            logger.log(SEVERE, "Error saving employee data for " + employee.getName(), e);
            throw new RuntimeException("Failed to save employee data", e); // signal failure to callers
        }
    }
}
