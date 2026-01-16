package com.theshubhamco.designpattern.creational.builder.naive.deduction;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
