package com.theshubhamco.designpattern.creational.builder.stagedbuilder.formatter;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
