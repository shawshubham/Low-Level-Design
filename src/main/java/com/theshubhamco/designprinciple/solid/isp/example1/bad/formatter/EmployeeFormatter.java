package com.theshubhamco.designprinciple.solid.isp.example1.bad.formatter;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
