package com.theshubhamco.designprinciple.solid.lsp.example1.good.deduction;

import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy{
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
