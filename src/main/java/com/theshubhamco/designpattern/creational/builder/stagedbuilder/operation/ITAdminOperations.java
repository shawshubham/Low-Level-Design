package com.theshubhamco.designpattern.creational.builder.stagedbuilder.operation;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public interface ITAdminOperations {
    //ITAdmin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);
}
