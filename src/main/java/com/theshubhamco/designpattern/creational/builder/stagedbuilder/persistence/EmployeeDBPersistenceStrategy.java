package com.theshubhamco.designpattern.creational.builder.stagedbuilder.persistence;

import java.util.logging.Logger;

//Simulated
public class EmployeeDBPersistenceStrategy implements EmployeePersistenceStrategy {
    private static final Logger logger = Logger.getLogger(EmployeeDBPersistenceStrategy.class.getName());

    @Override
    public void save(String formattedData) {
        //Simulate saving to DB
        logger.info("Saved data to DB: " + formattedData);
    }
}
