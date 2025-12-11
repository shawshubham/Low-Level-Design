package com.theshubhamco.designprinciple.solid.ocp.example2.bad.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
