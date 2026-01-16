package com.theshubhamco.designpattern.creational.builder.naive.client.model;

import com.theshubhamco.designpattern.creational.builder.naive.model.Department;
import com.theshubhamco.designpattern.creational.builder.naive.model.EmployeeType;

import java.time.LocalDate;

public class EmployeeReport {
    private String name;
    private EmployeeType type;
    private Department department;
    private double salary;
    private double deductions;
    private String managerName;
    private LocalDate joiningDate;
    private LocalDate exitDate;
    private String remarks;

    /**
     * If we have more fields, the constructor will keep on increasing in size, making it hard to manage
     * and read. This is a classic example of the telescoping constructor or constructor hell anti-pattern.
     */
    // All Args Constructor
    public EmployeeReport(
            String name,
            EmployeeType type,
            Department department,
            double salary,
            double deductions,
            String managerName,
            LocalDate joiningDate,
            LocalDate exitDate,
            String remarks
    ) {
        this.name = name;
        this.type = type;
        this.department = department;
        this.salary = salary;
        this.deductions = deductions;
        this.managerName = managerName;
        this.joiningDate = joiningDate;
        this.exitDate = exitDate;
        this.remarks = remarks;
    }

    // Few Args Constructor
    public EmployeeReport(
            String name,
            EmployeeType type,
            Department department,
            double salary,
            double deductions
    ) {
        this.name = name;
        this.type = type;
        this.department = department;
        this.salary = salary;
        this.deductions = deductions;
    }

    // Getters
    public String getName() { return name; }
    public EmployeeType getType() { return type; }
    public Department getDepartment() { return department; }
    public double getSalary() { return salary; }
    public double getDeductions() { return deductions; }
    public String getManagerName() { return managerName; }
    public LocalDate getJoiningDate() { return joiningDate; }
    public LocalDate getExitDate() { return exitDate; }
    public String getRemarks() { return remarks; }
}
