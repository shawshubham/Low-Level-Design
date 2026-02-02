package com.theshubhamco.designpattern.creational.builder.tobuilderexample.deduction;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
