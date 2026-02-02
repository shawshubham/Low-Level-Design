package com.theshubhamco.designpattern.creational.builder.stagedbuilder.salary;

import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.Employee;
import com.theshubhamco.designpattern.creational.builder.stagedbuilder.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
