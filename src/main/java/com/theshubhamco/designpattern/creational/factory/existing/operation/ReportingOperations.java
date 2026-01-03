package com.theshubhamco.designpattern.creational.factory.existing.operation;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    String generateReport(Employee employee);
}
