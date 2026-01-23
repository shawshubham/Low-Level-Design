package com.theshubhamco.designpattern.creational.abstractfactory.naive.operation;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;

public interface ITAdminOperations {
    //ITAdmin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);
}
