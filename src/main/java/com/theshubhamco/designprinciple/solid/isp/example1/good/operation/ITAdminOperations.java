package com.theshubhamco.designprinciple.solid.isp.example1.good.operation;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public interface ITAdminOperations {
    //ITAdmin Operations
    void provisionSystemAccess(Employee employee, String role, String systemId);
    void revokeSystemAccess(Employee employee, String role, String systemId);
}
