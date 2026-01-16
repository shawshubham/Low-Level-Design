package com.theshubhamco.designpattern.creational.builder.naive.operation;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public interface HROperations {
    //HR Operations
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void markAttendance(Employee employee, int daysPresent);
}
