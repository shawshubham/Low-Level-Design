package com.theshubhamco.designpattern.creational.factory.existing.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
