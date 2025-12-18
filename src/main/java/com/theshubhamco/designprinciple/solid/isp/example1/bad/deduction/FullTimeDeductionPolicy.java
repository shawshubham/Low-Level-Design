package com.theshubhamco.designprinciple.solid.isp.example1.bad.deduction;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
