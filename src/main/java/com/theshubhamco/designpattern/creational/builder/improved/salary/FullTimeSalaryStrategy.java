package com.theshubhamco.designpattern.creational.builder.improved.salary;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;
import com.theshubhamco.designpattern.creational.builder.improved.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
