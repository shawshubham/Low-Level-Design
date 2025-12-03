package com.theshubhamco.designprinciple.solid.ocp.example1.bad.service;

import java.util.logging.Logger;

//Simulated
public class EmployeeDBSaver {
    private static final Logger logger = Logger.getLogger(EmployeeDBSaver.class.getName());

    public void saveToDB(String formattedData) {
        //Simulate saving to DB
        logger.info("Saved data to DB: " + formattedData);
    }
}
