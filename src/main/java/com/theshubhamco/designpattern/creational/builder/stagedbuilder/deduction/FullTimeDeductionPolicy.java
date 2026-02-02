package com.theshubhamco.designpattern.creational.builder.stagedbuilder.deduction;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;
import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
