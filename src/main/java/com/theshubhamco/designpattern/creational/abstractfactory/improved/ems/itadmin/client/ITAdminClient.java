package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.itadmin.client;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.itadmin.api.ITAdminOperations;

public class ITAdminClient {
    private final ITAdminOperations itAdminOperations;

    public ITAdminClient(ITAdminOperations itAdminOperations) {
        this.itAdminOperations = itAdminOperations;
    }

    public void provisionSystemAccess(Employee employeeData, String role, String systemId) {
        // System access provisioning logic using employeeOperations
        itAdminOperations.provisionSystemAccess(employeeData, role, systemId);
    }

    public void revokeSystemAccess(Employee employeeData, String role, String systemId) {
        // System access revocation logic using employeeOperations
        itAdminOperations.revokeSystemAccess(employeeData, role, systemId);
    }
}
