package com.theshubhamco.designpattern.creational.factory.naive.formatter;

import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
