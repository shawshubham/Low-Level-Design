package com.theshubhamco.designpattern.creational.builder.stagedbuilder.operation;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);
}
