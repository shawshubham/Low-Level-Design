package com.theshubhamco.designprinciple.solid.ocp.example1.bad.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class EmployeeFileSaver {
    private final static Logger logger = Logger.getLogger(EmployeeFileSaver.class.getName());

    private final String filePath;

    public EmployeeFileSaver(String filePath) {
        this.filePath = filePath;
    }

    public void saveToFile(String formattedData) throws IOException {
        logger.info("Saving employee data to " + filePath);
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(formattedData + "\n");
        }
        logger.info("Saved employee data to " + filePath);
    }
}
