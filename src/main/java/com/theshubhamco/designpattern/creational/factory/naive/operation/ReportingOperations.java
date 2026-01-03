package com.theshubhamco.designpattern.creational.factory.naive.operation;

import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    String generateReport(Employee employee);
}
