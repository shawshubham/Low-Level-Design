package com.theshubhamco.designpattern.creational.builder.stagedbuilder.salary;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;
import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
