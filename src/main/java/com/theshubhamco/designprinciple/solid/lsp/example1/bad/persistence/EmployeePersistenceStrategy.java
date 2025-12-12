package com.theshubhamco.designprinciple.solid.lsp.example1.bad.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
