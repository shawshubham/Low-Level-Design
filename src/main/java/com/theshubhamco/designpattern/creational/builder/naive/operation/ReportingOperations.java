package com.theshubhamco.designpattern.creational.builder.naive.operation;

import com.theshubhamco.designpattern.creational.builder.naive.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);
}
