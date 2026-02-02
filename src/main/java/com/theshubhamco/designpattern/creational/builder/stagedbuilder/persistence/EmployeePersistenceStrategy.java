package com.theshubhamco.designpattern.creational.builder.stagedbuilder.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
