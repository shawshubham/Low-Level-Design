package com.theshubhamco.designpattern.creational.builder.naive.formatter;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
