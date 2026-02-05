package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.deduction;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
