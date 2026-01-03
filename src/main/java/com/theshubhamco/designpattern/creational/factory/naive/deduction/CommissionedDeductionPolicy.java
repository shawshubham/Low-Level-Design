package com.theshubhamco.designpattern.creational.factory.naive.deduction;

import com.theshubhamco.designpattern.creational.factory.naive.model.CommissionedEmployee;
import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;

public class CommissionedDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        CommissionedEmployee commissionedEmployee = (CommissionedEmployee) employee;
        // Compliance-based deduction (attendance is irrelevant for this employee type)
        return Math.max(0, commissionedEmployee.getComplianceBreach() * 0.1);
    }
}
