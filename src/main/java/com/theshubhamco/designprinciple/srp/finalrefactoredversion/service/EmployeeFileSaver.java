package com.theshubhamco.designprinciple.srp.finalrefactoredversion.service;

import java.io.FileWriter;
import java.io.IOException;

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
