package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.deduction;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
