package com.theshubhamco.designprinciple.solid.ocp.example1.bad.service;

import java.util.logging.Logger;

//Simulated
public class EmployeeRemoteAPISaver {
    private static final Logger logger = Logger.getLogger(EmployeeRemoteAPISaver.class.getName());

    public void saveToAPI(String formattedData) {
        //Simulate calling API call
        logger.info("Sending API Call: " + formattedData);
    }
}
