package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.shared.formatter;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
