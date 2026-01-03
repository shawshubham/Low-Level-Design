package com.theshubhamco.designpattern.creational.factory.existing.operation;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public interface HROperations {
    //HR Operations
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void markAttendance(Employee employee, int daysPresent);
}
