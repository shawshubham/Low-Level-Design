package com.theshubhamco.designprinciple.solid.isp.example1.bad.client;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.service.EmployeeOperations;

public class ITAdminClient {
    private final EmployeeOperations employeeOperations;

    public ITAdminClient(EmployeeOperations employeeOperations) {
        this.employeeOperations = employeeOperations;
    }

    public void provisionSystemAccess(Employee employeeData, String role, String systemId) {
        // System access provisioning logic using employeeOperations
        employeeOperations.provisionSystemAccess(employeeData, role, systemId);
    }

    public void revokeSystemAccess(Employee employeeData, String role, String systemId) {
        // System access revocation logic using employeeOperations
        employeeOperations.revokeSystemAccess(employeeData, role, systemId);
    }
}
