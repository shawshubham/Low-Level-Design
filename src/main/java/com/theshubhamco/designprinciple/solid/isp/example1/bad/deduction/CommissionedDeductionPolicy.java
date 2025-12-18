package com.theshubhamco.designprinciple.solid.isp.example1.bad.deduction;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.CommissionedEmployee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;

public class CommissionedDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        CommissionedEmployee commissionedEmployee = (CommissionedEmployee) employee;
        // Compliance-based deduction (attendance is irrelevant for this employee type)
        return Math.max(0, commissionedEmployee.getComplianceBreach() * 0.1);
    }
}
