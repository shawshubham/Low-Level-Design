package com.theshubhamco.designpattern.creational.factory.naive.deduction;

import com.theshubhamco.designpattern.creational.factory.naive.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
