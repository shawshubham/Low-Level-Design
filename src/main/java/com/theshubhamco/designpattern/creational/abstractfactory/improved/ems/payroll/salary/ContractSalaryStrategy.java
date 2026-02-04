package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.ContractEmployee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;

public class ContractSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //hourly rate × hours worked
        ContractEmployee contractEmployee = (ContractEmployee) employee;
        return contractEmployee.getHourlyRate() * contractEmployee.getHoursWorked();
    }
}
