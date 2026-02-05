package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.formatter;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
