package com.theshubhamco.designprinciple.solid.lsp.example1.good.formatter;

import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.Employee;

public class EmployeeFormatter {
    public String formatForHR(Employee employee) {
        return employee.getName() + " - " + employee.getType().name();
    }
}
