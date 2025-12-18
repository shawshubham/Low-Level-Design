package com.theshubhamco.designprinciple.solid.isp.example1.good.persistence;

import java.util.logging.Logger;

//Simulated
public class EmployeeAPIPersistenceStrategy implements EmployeePersistenceStrategy {
    private static final Logger logger = Logger.getLogger(EmployeeAPIPersistenceStrategy.class.getName());

    @Override
    public void save(String formattedData) {
        //Simulate calling API call
        logger.info("Sending API Call: " + formattedData);
    }
}
