package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.api;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportReportRequest;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);

    void exportReport(Employee employeeData, ExportReportRequest request);
}
