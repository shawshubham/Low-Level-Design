package com.theshubhamco.designprinciple.solid.ocp.example2.good.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
