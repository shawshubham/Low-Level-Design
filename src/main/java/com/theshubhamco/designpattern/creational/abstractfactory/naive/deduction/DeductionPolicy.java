package com.theshubhamco.designpattern.creational.abstractfactory.naive.deduction;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
