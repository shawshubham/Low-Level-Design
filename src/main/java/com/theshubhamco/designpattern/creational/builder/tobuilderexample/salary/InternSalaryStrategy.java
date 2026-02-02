package com.theshubhamco.designpattern.creational.builder.tobuilderexample.salary;

import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.Employee;
import com.theshubhamco.designpattern.creational.builder.tobuilderexample.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
