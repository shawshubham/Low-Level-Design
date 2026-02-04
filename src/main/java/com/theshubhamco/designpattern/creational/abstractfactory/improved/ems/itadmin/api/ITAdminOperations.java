package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.itadmin.api;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;

public interface ITAdminOperations {
    //ITAdmin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);
}
