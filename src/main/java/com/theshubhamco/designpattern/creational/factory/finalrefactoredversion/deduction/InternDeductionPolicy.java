package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.deduction;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
