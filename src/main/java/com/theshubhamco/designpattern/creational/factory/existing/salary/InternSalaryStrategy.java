package com.theshubhamco.designpattern.creational.factory.existing.salary;

import com.theshubhamco.designpattern.creational.factory.existing.model.Employee;
import com.theshubhamco.designpattern.creational.factory.existing.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
