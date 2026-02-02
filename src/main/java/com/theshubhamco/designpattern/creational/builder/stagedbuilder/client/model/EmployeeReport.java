package com.theshubhamco.designpattern.creational.builder.stagedbuilder.client.model;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Department;
import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.EmployeeType;

import java.time.LocalDate;

public class EmployeeReport {
    public interface NameStep {
        TypeStep name(String name);
    }

    public interface TypeStep {
        DepartmentStep type(EmployeeType type);
    }

    public interface DepartmentStep {
        OptionalFieldStep department(Department department);
    }

    public interface OptionalFieldStep {
        OptionalFieldStep salary(double salary);
        OptionalFieldStep deductions(double deductions);
        OptionalFieldStep managerName(String managerName);
        OptionalFieldStep joiningDate(LocalDate joiningDate);
        OptionalFieldStep exitDate(LocalDate exitDate);
        OptionalFieldStep remarks(String remarks);
        EmployeeReport build();
    }

    private final String name; // Suppose is mandatory, and we should check this at compile time
    private final EmployeeType type; // Suppose is manda, and we should check this at compile time
    private final Department department; // Suppose is mandatory, and we should check this at compile time
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

    public static NameStep builder(){
        return new Builder();
    }

    private static final class Builder implements NameStep, TypeStep, DepartmentStep, OptionalFieldStep {
        private String name;
        private EmployeeType type;
        private Department department;
        private double salary;
        private double deductions;
        private String managerName;
        private LocalDate joiningDate;
        private LocalDate exitDate;
        private String remarks;

        @Override
        public TypeStep name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public DepartmentStep type(EmployeeType type) {
            this.type = type;
            return this;
        }

        @Override
        public OptionalFieldStep department(Department department) {
            this.department = department;
            return this;
        }

        @Override
        public OptionalFieldStep salary(double salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public OptionalFieldStep deductions(double deductions) {
            this.deductions = deductions;
            return this;
        }

        @Override
        public OptionalFieldStep managerName(String managerName) {
            this.managerName = managerName;
            return this;
        }

        @Override
        public OptionalFieldStep joiningDate(LocalDate joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        @Override
        public OptionalFieldStep exitDate(LocalDate exitDate) {
            this.exitDate = exitDate;
            return this;
        }

        @Override
        public OptionalFieldStep remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        @Override
        public EmployeeReport build() {
            if (name == null || name.isBlank()) {
                throw new IllegalStateException("name is mandatory");
            }
            if (type == null) {
                throw new IllegalStateException("type is mandatory");
            }
            if (department == null) {
                throw new IllegalStateException("department is mandatory");
            }
            if (joiningDate != null && exitDate != null && exitDate.isBefore(joiningDate)) {
                throw new IllegalStateException("exitDate cannot be before joiningDate");
            }
            if (salary < 0) throw new IllegalStateException("salary cannot be negative");
            if (deductions < 0) throw new IllegalStateException("deductions cannot be negative");
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
}
