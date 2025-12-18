package com.theshubhamco.designprinciple.solid.isp.example1.good.operation;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public interface ReportingOperations {
    //Reporting Operations
    String generateReport(Employee employee);
}
