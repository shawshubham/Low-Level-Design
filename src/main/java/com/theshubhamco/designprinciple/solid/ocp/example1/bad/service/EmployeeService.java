package com.theshubhamco.designprinciple.solid.ocp.example1.bad.service;

import com.theshubhamco.designprinciple.solid.ocp.example1.bad.model.Employee;

import java.io.IOException;
import java.util.logging.Logger;

public class EmployeeService {
    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

    private final EmployeeFormatter employeeFormatter;
    private EmployeeFileSaver employeeFileSaver;
    private EmployeeDBSaver employeeDBSaver;
    private EmployeeRemoteAPISaver employeeRemoteAPISaver;

    public EmployeeService(EmployeeFormatter employeeFormatter,
                           EmployeeFileSaver employeeFileSaver) {
        this.employeeFormatter = employeeFormatter;
        this.employeeFileSaver = employeeFileSaver;
    }

    public EmployeeService(EmployeeFormatter employeeFormatter,
                           EmployeeDBSaver employeeDBSaver) {
        this.employeeFormatter = employeeFormatter;
        this.employeeDBSaver = employeeDBSaver;
    }

    public EmployeeService(EmployeeFormatter employeeFormatter,
                           EmployeeRemoteAPISaver employeeRemoteAPISaver) {
        this.employeeFormatter = employeeFormatter;
        this.employeeRemoteAPISaver = employeeRemoteAPISaver;
    }

    public void save(Employee employee, String destinationType) {
        String formatted = employeeFormatter.formatForHR(employee);
        switch (destinationType) {
            case "FILE":
                try {
                    employeeFileSaver.saveToFile(formatted);
                } catch (IOException e) {
                    logger.severe("Error saving employee data: " + e.getMessage());
                    // optionally re-throw or handle differently in production
                }
                break;
            case "DB":
                employeeDBSaver.saveToDB(formatted);
                break;
            case "REMOTE":
                employeeRemoteAPISaver.saveToAPI(formatted);
                break;
            default:
                throw new IllegalArgumentException("Unknown destination type");
        }
    }
}
