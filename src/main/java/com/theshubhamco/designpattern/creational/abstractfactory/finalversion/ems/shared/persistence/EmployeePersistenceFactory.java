package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.shared.persistence;

import java.util.Map;
import java.util.function.Supplier;

//Lazy Initialization Factory Pattern, supplier will create object only when required
public class EmployeePersistenceFactory {
    private final Map<PersistenceType, Supplier<EmployeePersistenceStrategy>> supplierMap;

    public EmployeePersistenceFactory (String fileName) {
        this.supplierMap = Map.of(
                PersistenceType.FILE, () -> new EmployeeFilePersistenceStrategy(fileName),
                PersistenceType.DATABASE, EmployeeDBPersistenceStrategy::new,
                PersistenceType.API, EmployeeAPIPersistenceStrategy::new);
    }

    public EmployeePersistenceStrategy create(PersistenceType type) {
        Supplier<EmployeePersistenceStrategy> supplier = supplierMap.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("Unknown persistence type: " + type);
        }
        return supplier.get();
    }
}
