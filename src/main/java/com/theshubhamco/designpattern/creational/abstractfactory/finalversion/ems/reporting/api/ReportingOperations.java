package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.api;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportReportRequest;

public interface ReportingOperations {
    //Reporting Operations
    EmployeeReport generateReport(Employee employee);

    void exportReport(Employee employeeData, ExportReportRequest request);
}
