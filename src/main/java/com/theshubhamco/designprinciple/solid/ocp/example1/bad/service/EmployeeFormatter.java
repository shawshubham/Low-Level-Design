package com.theshubhamco.designprinciple.solid.ocp.example1.bad.service;

import com.theshubhamco.designprinciple.solid.ocp.example1.bad.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
