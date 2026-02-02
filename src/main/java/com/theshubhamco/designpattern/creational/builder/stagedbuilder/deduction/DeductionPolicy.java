package com.theshubhamco.designpattern.creational.builder.stagedbuilder.deduction;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
