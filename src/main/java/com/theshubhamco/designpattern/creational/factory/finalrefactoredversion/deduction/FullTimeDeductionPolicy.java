package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.deduction;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;
import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
