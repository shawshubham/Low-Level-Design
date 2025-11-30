package com.theshubhamco.designprinciple.srp.finalrefactoredversion.service;

import com.theshubhamco.designprinciple.srp.finalrefactoredversion.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
