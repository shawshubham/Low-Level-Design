package com.theshubhamco.designpattern.creational.abstractfactory.naive.deduction;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.FullTimeEmployee;

public class FullTimeDeductionPolicy implements DeductionPolicy {
    @Override
    public double calculateDeduction(Employee employee) {
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getDaysAbsent() * 50;
    }
}
