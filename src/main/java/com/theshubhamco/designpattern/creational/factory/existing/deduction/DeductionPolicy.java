package com.theshubhamco.designpattern.creational.factory.existing.deduction;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
