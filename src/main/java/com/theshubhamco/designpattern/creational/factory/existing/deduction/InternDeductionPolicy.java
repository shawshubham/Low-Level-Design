package com.theshubhamco.designpattern.creational.factory.existing.deduction;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
