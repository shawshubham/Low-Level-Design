package com.theshubhamco.designpattern.creational.builder.improved.deduction;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
