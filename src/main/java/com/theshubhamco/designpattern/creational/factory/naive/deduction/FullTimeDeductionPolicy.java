package com.theshubhamco.designpattern.creational.factory.naive.deduction;

import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.factory.naive.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
