package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.Employee;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
