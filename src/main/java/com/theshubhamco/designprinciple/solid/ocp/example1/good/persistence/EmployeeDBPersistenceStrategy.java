package com.theshubhamco.designprinciple.solid.ocp.example1.good.persistence;

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
