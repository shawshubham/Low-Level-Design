package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.hr.client;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.hr.api.HROperations;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HRClient {
    private static final Logger logger = Logger.getLogger(HRClient.class.getName());
    private final HROperations hrOperations;

    public HRClient(HROperations hrOperations) {
        this.hrOperations = hrOperations;
    }

    public void addEmployee(Employee employeeData) {
        logger.log(Level.INFO, "Adding employee {0}", employeeData);
        hrOperations.addEmployee(employeeData);
        logger.log(Level.INFO, "Added employee {0}", employeeData);
    }

    public void updateEmployee(Employee employeeData){
        logger.log(Level.INFO, "Updating employee {0}", employeeData);
        hrOperations.updateEmployee(employeeData);
        logger.log(Level.INFO, "Updated employee {0}", employeeData);
    }

    public void markAttendance(Employee employeeData, int daysPresent){
        logger.log(Level.INFO, "Marking attendance for employee {0}", employeeData);
        hrOperations.markAttendance(employeeData, daysPresent);
        logger.log(Level.INFO, "Marked attendance for employee {0}", employeeData);
    }
}
