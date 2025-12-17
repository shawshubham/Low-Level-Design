package com.theshubhamco.designprinciple.solid.lsp.example1.good.persistence;

public interface EmployeePersistenceStrategy {
    void save(String formattedData);
}
