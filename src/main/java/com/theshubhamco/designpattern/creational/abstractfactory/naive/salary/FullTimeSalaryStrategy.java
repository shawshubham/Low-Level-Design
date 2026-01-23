package com.theshubhamco.designpattern.creational.abstractfactory.naive.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
