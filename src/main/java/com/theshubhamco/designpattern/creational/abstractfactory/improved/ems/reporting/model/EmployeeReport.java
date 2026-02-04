package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Department;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.EmployeeType;

import java.time.LocalDate;

public class EmployeeReport {
    private final String name;
    private final EmployeeType type;
    private final Department department;
    private final double salary;
    private final double deductions;
    private final String managerName;
    private final LocalDate joiningDate;
    private final LocalDate exitDate;
    private final String remarks;

    private EmployeeReport(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.department = builder.department;
        this.salary = builder.salary;
        this.deductions = builder.deductions;
        this.managerName = builder.managerName;
        this.joiningDate = builder.joiningDate;
        this.exitDate = builder.exitDate;
        this.remarks = builder.remarks;
    }

    public static class Builder {
        private String name;
        private EmployeeType type;
        private Department department;
        private double salary;
        private double deductions;
        private String managerName;
        private LocalDate joiningDate;
        private LocalDate exitDate;
        private String remarks;

        // Added for toBuilder feature
        public Builder() {}

        public Builder(EmployeeReport report) {
            this.name = report.name;
            this.type = report.type;
            this.department = report.department;
            this.salary = report.salary;
            this.deductions = report.deductions;
            this.managerName = report.managerName;
            this.joiningDate = report.joiningDate;
            this.exitDate = report.exitDate;
            this.remarks = report.remarks;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(EmployeeType type) {
            this.type = type;
            return this;
        }

        public Builder department(Department department) {
            this.department = department;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder deductions(double deductions) {
            this.deductions = deductions;
            return this;
        }

        public Builder managerName(String managerName) {
            this.managerName = managerName;
            return this;
        }

        public Builder joiningDate(LocalDate joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public Builder exitDate(LocalDate exitDate) {
            this.exitDate = exitDate;
            return this;
        }

        public Builder remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        public EmployeeReport build() {
            if (name == null || type == null || department == null) {
                throw new IllegalStateException("Name, type, and department are mandatory");
            }
            return new EmployeeReport(this);
        }
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

    // Added to fetch toBuilder feature
    public Builder toBuilder() {
        return new Builder(this);
    }
}
