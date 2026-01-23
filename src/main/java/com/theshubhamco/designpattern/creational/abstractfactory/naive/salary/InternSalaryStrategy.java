package com.theshubhamco.designpattern.creational.abstractfactory.naive.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
