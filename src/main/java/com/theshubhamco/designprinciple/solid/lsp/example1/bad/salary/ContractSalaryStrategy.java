package com.theshubhamco.designprinciple.solid.lsp.example1.bad.salary;

import com.theshubhamco.designprinciple.solid.lsp.example1.bad.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.lsp.example1.bad.model.Employee;

public class ContractSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //hourly rate × hours worked
        ContractEmployee contractEmployee = (ContractEmployee) employee;
        return contractEmployee.getHourlyRate() * contractEmployee.getHoursWorked();
    }
}
