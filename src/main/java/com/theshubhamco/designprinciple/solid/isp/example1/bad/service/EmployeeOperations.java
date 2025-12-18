package com.theshubhamco.designprinciple.solid.isp.example1.bad.service;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;

public interface EmployeeOperations {
    //HR Operations
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void markAttendance(Employee employee, int daysPresent);

    //Payroll Operations
    double calculateSalary(Employee employee);
    double calculateDeduction(Employee employee);

    //IT/Admin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);

    //Reporting Operations
    String generateReport(Employee employee);
}
