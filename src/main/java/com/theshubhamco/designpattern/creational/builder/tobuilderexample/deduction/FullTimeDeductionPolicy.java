package com.theshubhamco.designpattern.creational.builder.tobuilderexample.deduction;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
