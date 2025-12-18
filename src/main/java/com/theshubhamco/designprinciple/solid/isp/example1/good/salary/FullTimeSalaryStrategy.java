package com.theshubhamco.designprinciple.solid.isp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.isp.example1.good.model.FullTimeEmployee;

public class FullTimeSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        //base salary + bonus
        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
        return fullTimeEmployee.getBaseSalary() + fullTimeEmployee.getBonus();
    }
}
