package com.theshubhamco.designprinciple.solid.isp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public class ContractSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //hourly rate × hours worked
        ContractEmployee contractEmployee = (ContractEmployee) employee;
        return contractEmployee.getHourlyRate() * contractEmployee.getHoursWorked();
    }
}
