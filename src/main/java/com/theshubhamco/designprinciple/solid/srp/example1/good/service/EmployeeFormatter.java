package com.theshubhamco.designprinciple.solid.srp.example1.good.service;

import com.theshubhamco.designprinciple.solid.srp.example1.good.model.Employee;

//Responsible for formatting employee data as required by HR
public class EmployeeFormatter {
    public String formatForHR(Employee emp) {
        return emp.getName() + " - " + emp.getType().toUpperCase();
    }
}
