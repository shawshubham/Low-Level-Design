package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.deduction;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
