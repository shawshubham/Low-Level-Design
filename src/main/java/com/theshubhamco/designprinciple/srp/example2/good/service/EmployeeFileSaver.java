package com.theshubhamco.designprinciple.srp.example2.good.service;

import java.io.FileWriter;
import java.io.IOException;

//Handles persistence logic
public class EmployeeFileSaver {
    private final String filePath;

    public EmployeeFileSaver(String filePath) {
        this.filePath = filePath;
    }

    public void saveToFile(String formattedData) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(formattedData + "\n");
        }
    }
}