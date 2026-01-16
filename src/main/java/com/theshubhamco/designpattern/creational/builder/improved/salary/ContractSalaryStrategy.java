package com.theshubhamco.designpattern.creational.builder.improved.salary;

import com.theshubhamco.designpattern.creational.builder.improved.model.ContractEmployee;
import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public class ContractSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //hourly rate × hours worked
        ContractEmployee contractEmployee = (ContractEmployee) employee;
        return contractEmployee.getHourlyRate() * contractEmployee.getHoursWorked();
    }
}
