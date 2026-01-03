package com.theshubhamco.designpattern.creational.factory.improved.deduction;

import com.theshubhamco.designpattern.creational.factory.improved.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
