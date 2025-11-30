package com.theshubhamco.designprinciple.srp.example2.good.service;

import com.theshubhamco.designprinciple.srp.example2.good.model.Employee;

//Responsible for formatting employee data as required by HR
public class EmployeeFormatter {
    public String formatForHR(Employee emp) {
        return emp.getName() + " - " + emp.getType().toUpperCase();
    }
}