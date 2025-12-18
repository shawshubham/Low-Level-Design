package com.theshubhamco.designprinciple.solid.isp.example1.good.salary;

import com.theshubhamco.designprinciple.solid.isp.example1.good.model.CommissionedEmployee;
import com.theshubhamco.designprinciple.solid.isp.example1.good.model.Employee;

public class CommissionedSalaryStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculate(Employee employee) {
        CommissionedEmployee commissionedEmployee = (CommissionedEmployee) employee;
        //base salary + commission (5%, 7%, 10%)
        double monthlySales = commissionedEmployee.getMonthlySales();
        double commission = 0;

        if(monthlySales >= 50000 && monthlySales < 75000) {
            commission =  monthlySales * 0.05;
        } else if(monthlySales >= 75000 && monthlySales < 100000) {
            commission =  monthlySales * 0.07;
        } else if(monthlySales >= 100000) {
            commission =  monthlySales * 0.1;
        }
        return commissionedEmployee.getBaseSalary() + commission;
    }
}