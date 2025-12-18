package com.theshubhamco.designprinciple.solid.isp.example1.good.client;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.good.operation.ITAdminOperations;
import com.theshubhamco.designprinciple.solid.isp.example1.good.operation.PayrollOperations;

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
