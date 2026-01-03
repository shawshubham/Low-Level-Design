package com.theshubhamco.designpattern.creational.factory.existing.deduction;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;
import com.theshubhamco.designpattern.creational.factory.existing.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
