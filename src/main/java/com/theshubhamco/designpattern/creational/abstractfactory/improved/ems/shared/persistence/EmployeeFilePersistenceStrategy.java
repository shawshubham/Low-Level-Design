package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.shared.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class EmployeeFilePersistenceStrategy implements EmployeePersistenceStrategy {
    private static final Logger logger = Logger.getLogger(EmployeeFilePersistenceStrategy.class.getName());

    private final String filePath;

    public EmployeeFilePersistenceStrategy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(String formattedData) {
        logger.info("Saving employee data to " + filePath);
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(formattedData + "\n");
        } catch (IOException e) {
            logger.severe("File saved failed: " + e.getMessage());
        }
        logger.info("Saved employee data to " + filePath);
    }
}
