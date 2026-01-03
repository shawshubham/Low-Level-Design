package com.theshubhamco.designpattern.creational.factory.existing.formatter;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
