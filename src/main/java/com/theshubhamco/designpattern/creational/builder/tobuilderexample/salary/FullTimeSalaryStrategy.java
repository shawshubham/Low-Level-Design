package com.theshubhamco.designpattern.creational.builder.tobuilderexample.salary;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
