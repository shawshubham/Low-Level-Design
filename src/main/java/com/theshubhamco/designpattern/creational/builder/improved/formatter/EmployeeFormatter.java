package com.theshubhamco.designpattern.creational.builder.improved.formatter;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
