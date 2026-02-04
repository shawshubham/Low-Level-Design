package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.itadmin.service;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.itadmin.api.ITAdminOperations;

public class ITAdminOperationsService implements ITAdminOperations {
    @Override
    public void provisionSystemAccess(Employee employee, String role, String systemId) {
        //real logic to provision access to system
    }

    @Override
    public void revokeSystemAccess(Employee employee, String role, String systemId) {
        //real logic to revoke access to system
    }
}
