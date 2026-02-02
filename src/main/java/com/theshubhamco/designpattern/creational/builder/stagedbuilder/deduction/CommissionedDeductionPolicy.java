package com.theshubhamco.designpattern.creational.builder.stagedbuilder.deduction;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.CommissionedEmployee;
import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public class CommissionedDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        CommissionedEmployee commissionedEmployee = (CommissionedEmployee) employee;
        // Compliance-based deduction (attendance is irrelevant for this employee type)
        return Math.max(0, commissionedEmployee.getComplianceBreach() * 0.1);
    }
}
