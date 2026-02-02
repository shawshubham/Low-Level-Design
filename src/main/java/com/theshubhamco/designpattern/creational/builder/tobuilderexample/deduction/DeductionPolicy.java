package com.theshubhamco.designpattern.creational.builder.tobuilderexample.deduction;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
