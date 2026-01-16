package com.theshubhamco.designpattern.creational.builder.improved.salary;

import com.theshubhamco.designpattern.creational.builder.improved.model.Employee;
import com.theshubhamco.designpattern.creational.builder.improved.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
