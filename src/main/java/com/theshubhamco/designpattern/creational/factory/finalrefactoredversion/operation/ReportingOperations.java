package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.operation;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    String generateReport(Employee employee);
}
