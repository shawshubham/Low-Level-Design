package com.theshubhamco.designprinciple.solid.lsp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
