package com.theshubhamco.designprinciple.solid.srp.finalrefactoredversion.service;

import com.theshubhamco.designprinciple.solid.srp.finalrefactoredversion.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
