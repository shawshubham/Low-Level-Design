package com.theshubhamco.designprinciple.solid.ocp.example2.bad.businesslogic;

import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.FullTimeEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example2.bad.model.InternEmployee;

public class SalaryCalculator {
    public double calculate(Employee employee) {
        switch (employee.getType()) {
            case FULL_TIME:
                return calculateFullTimeSalary(employee);
            case CONTRACT:
                return calculateContractSalary(employee);
            case INTERN:
                return calculateInternSalary(employee);
            default:
                throw new IllegalArgumentException("Invalid employee type");

        }
    }

    private double calculateFullTimeSalary(Employee employee) {
        //base salary + bonus
        return ((FullTimeEmployee) employee).getBaseSalary() + ((FullTimeEmployee) employee).getBonus();
    }

    private double calculateContractSalary(Employee employee) {
        //hourly rate × hours worked
        return ((ContractEmployee) employee).getHourlyRate() * ((ContractEmployee) employee).getHoursWorked();
    }

    private double calculateInternSalary(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}

