package com.theshubhamco.designpattern.creational.builder.naive.deduction;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
