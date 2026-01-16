package com.theshubhamco.designpattern.creational.builder.improved.operation;

import com.theshubhamco.designpattern.creational.builder.improved.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);
}
