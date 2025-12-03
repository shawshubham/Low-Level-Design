package com.theshubhamco.designprinciple.solid.srp.example2.bad.model;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract String getType();

    public void save() {
        // Format according to HR
        String formatted = name + " - " + getType().toUpperCase();

        // Save to file
        try (FileWriter writer = new FileWriter("employees.txt", true)) {
            writer.write(formatted + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}