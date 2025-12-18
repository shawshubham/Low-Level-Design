package com.theshubhamco.designprinciple.solid.isp.example1.good.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
