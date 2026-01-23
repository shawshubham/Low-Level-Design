package com.theshubhamco.designpattern.creational.abstractfactory.naive.deduction;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
