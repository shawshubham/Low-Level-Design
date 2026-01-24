package com.theshubhamco.designpattern.creational.abstractfactory.naive.service;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.operation.ITAdminOperations;

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
