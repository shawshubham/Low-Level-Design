package com.theshubhamco.designpattern.creational.builder.tobuilderexample.operation;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);
}
