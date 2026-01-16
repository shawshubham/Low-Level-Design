package com.theshubhamco.designpattern.creational.builder.naive.operation;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public interface ITAdminOperations {
    //ITAdmin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);
}
