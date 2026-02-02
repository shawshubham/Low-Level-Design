package com.theshubhamco.designpattern.creational.builder.tobuilderexample.formatter;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
