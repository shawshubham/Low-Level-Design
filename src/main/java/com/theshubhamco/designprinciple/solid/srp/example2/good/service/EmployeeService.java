package com.theshubhamco.designprinciple.solid.srp.example2.good.service;

import com.theshubhamco.designprinciple.solid.srp.example2.good.model.Employee;

import java.io.IOException;

//Employee Orchestrator
public class EmployeeService {
    private final EmployeeFormatter formatter;
    private final EmployeeFileSaver fileSaver;

    public EmployeeService(EmployeeFormatter formatter, EmployeeFileSaver fileSaver) {
        this.formatter = formatter;
        this.fileSaver = fileSaver;
    }

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
