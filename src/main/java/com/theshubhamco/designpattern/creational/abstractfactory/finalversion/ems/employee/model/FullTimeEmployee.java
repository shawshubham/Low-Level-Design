package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.model;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.employee.deduction.FullTimeDeductionPolicy;

public class FullTimeEmployee extends Employee {
    private final double baseSalary;
    private final double bonus;
    private final int daysAbsent;

    public FullTimeEmployee(String name,
                            Department department,
                            double baseSalary,
                            double bonus,
                            int daysAbsent) {
        super(name, department, new FullTimeDeductionPolicy());
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.daysAbsent = daysAbsent;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.FULLTIME;
    }

    public  double getBaseSalary() { return baseSalary; }

    public double getBonus() { return bonus; }

    public double getDaysAbsent() { return daysAbsent; }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}
