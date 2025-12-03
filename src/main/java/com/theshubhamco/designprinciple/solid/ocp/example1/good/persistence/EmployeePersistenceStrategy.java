package com.theshubhamco.designprinciple.solid.ocp.example1.good.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
