package com.theshubhamco.designpattern.creational.factory.naive.persistence;

public class EmployeePersistenceFactory {

    public static EmployeePersistenceStrategy create(String destinationType) {
        switch (destinationType) {
            case "FILE":
                return new EmployeeFilePersistenceStrategy("employee.txt");
            case "DATABASE":
                return new EmployeeDBPersistenceStrategy();
            case "API":
                return new EmployeeAPIPersistenceStrategy();
            default:
                throw new IllegalArgumentException("Unknown persistence type: " + destinationType);
        }
    }
}
