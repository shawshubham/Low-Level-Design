package com.theshubhamco.designprinciple.srp.example1.good.service;

import com.theshubhamco.designprinciple.srp.example1.good.model.Employee;

import java.io.IOException;

public class EmployeeService {
    private final EmployeeFormatter formatter = new EmployeeFormatter();
    private final EmployeeFileSaver fileSaver = new EmployeeFileSaver();

    public void save(Employee emp) {
        String formatted = formatter.formatForHR(emp);
        try {
            fileSaver.saveToFile(formatted);
        } catch (IOException e) {
            // ✅ Proper place to log/report
            System.err.println("Error saving employee data: " + e.getMessage());
            // Optionally log to a file or monitoring system
        }
    }
}