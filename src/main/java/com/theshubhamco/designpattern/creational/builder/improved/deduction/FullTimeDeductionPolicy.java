package com.theshubhamco.designpattern.creational.builder.improved.deduction;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;
import com.theshubhamco.designpattern.creational.builder.improved.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
