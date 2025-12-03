package com.theshubhamco.designprinciple.solid.srp.example1.good.service;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFileSaver {
    public void saveToFile(String formattedData) throws IOException {
        try (FileWriter writer = new FileWriter("employees.txt", true)) {
            writer.write(formattedData + "\n");
        }
    }
}
