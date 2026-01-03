package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.formatter;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
