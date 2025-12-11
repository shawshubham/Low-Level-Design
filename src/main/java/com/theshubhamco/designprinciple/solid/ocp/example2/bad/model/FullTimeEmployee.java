package com.theshubhamco.designprinciple.solid.ocp.example2.bad.model;

public class FullTimeEmployee extends Employee {
    private final int baseSalary;
    private final int bonus;

    public FullTimeEmployee(String name, int baseSalary, int bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.FULL_TIME;
    }

    public  int getBaseSalary() { return baseSalary; }

    public int getBonus() { return bonus; }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}
