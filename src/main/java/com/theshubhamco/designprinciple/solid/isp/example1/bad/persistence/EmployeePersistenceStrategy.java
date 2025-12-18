package com.theshubhamco.designprinciple.solid.isp.example1.bad.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
