package com.theshubhamco.designprinciple.solid.isp.example1.bad.client;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.service.EmployeeOperations;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HRClient {
    private static final Logger logger = Logger.getLogger(HRClient.class.getName());
    private final EmployeeOperations employeeOperations;

    public HRClient(EmployeeOperations employeeOperations) {
        this.employeeOperations = employeeOperations;
    }

    public void addEmployee(Employee employeeData) {
        logger.log(Level.INFO, "Adding employee {0}", employeeData);
        employeeOperations.addEmployee(employeeData);
        logger.log(Level.INFO, "Added employee {0}", employeeData);
    }

    public void updateEmployee(Employee employeeData){
        logger.log(Level.INFO, "Updating employee {0}", employeeData);
        employeeOperations.updateEmployee(employeeData);
        logger.log(Level.INFO, "Updated employee {0}", employeeData);
    }

    public void markAttendance(Employee employeeData, int daysPresent){
        logger.log(Level.INFO, "Marking attendance for employee {0}", employeeData);
        employeeOperations.markAttendance(employeeData, daysPresent);
        logger.log(Level.INFO, "Marked attendance for employee {0}", employeeData);
    }
}
