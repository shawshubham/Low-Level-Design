package com.theshubhamco.designpattern.creational.factory.improved.persistence;

public class EmployeePersistenceFactory {

    public static EmployeePersistenceStrategy create(PersistenceType type) {
        switch (type) {
            case FILE:
                return new EmployeeFilePersistenceStrategy("employee.txt");
            case DATABASE:
                return new EmployeeDBPersistenceStrategy();
            case API:
                return new EmployeeAPIPersistenceStrategy();
            default:
                throw new IllegalArgumentException("Unknown persistence type: " + type);
        }
    }
}
