package com.theshubhamco.designpattern.creational.builder.naive.salary;

import com.theshubhamco.designpattern.creational.builder.naive.model.Employee;
import com.theshubhamco.designpattern.creational.builder.naive.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
