package com.theshubhamco.designprinciple.solid.isp.example1.bad.deduction;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;

public class InternDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        return 0; // Interns never have deductions
    }
}
