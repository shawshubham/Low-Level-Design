package com.theshubhamco.designpattern.creational.factory.existing.operation;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public interface ITAdminOperations {
    //ITAdmin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);
}
