package com.theshubhamco.designprinciple.solid.isp.example1.good.operation;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public interface HROperations {
    //HR Operations
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void markAttendance(Employee employee, int daysPresent);
}
