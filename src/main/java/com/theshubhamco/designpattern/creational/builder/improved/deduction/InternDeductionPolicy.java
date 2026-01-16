package com.theshubhamco.designpattern.creational.builder.improved.deduction;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
