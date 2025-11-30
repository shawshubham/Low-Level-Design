package com.theshubhamco.designprinciple.srp.example1.bad;

import java.io.FileWriter;
import java.io.IOException;

// ❌ Violates SRP: Employee handles multiple responsibilities (data + formatting + persistence)
class Employee {
    private String name;
    private String type; // Employee type: Full-time, Contract, Intern

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void save() {
        // ❌ Formatting logic: should ideally be handled by a separate class
        String formatted = name + " - " + type.toUpperCase();

        // ❌ Persistence logic: writing to a file is a separate responsibility
        try (FileWriter writer = new FileWriter("employees.txt", true)) {
            writer.write(formatted + "\n");
        } catch (IOException e) {
            e.printStackTrace(); // ❌ SRP violation: exception handling is also a separate concern
        }
    }
}

//What client has to do!
public class EmployeeBadDesign {
    public static void main(String args[]) {
        Employee fullTimeEmployee = new Employee("Shubham", "FULLTIME");
        Employee contractEmployee = new Employee("Ashwarya", "CONTRACT");
        Employee internEmployee = new Employee("Arvind", "INTERN");

        fullTimeEmployee.save();
        contractEmployee.save();
        internEmployee.save();
    }
}