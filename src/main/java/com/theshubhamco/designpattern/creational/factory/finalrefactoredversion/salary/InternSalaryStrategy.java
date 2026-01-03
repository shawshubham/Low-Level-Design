package com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.salary;

import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.Employee;
import com.theshubhamco.designpattern.creational.factory.finalrefactoredversion.model.InternEmployee;

public class InternSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //fixed stipend
        return ((InternEmployee) employee).getStipend();
    }
}
