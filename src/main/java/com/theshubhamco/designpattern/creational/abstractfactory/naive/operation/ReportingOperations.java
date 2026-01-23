package com.theshubhamco.designpattern.creational.abstractfactory.naive.operation;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);
}
