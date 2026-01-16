package com.theshubhamco.designpattern.creational.builder.naive.salary;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;
import com.theshubhamco.designpattern.creational.builder.naive.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
