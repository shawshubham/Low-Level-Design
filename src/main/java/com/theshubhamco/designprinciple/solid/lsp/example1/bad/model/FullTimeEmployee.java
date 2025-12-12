package com.theshubhamco.designprinciple.solid.lsp.example1.bad.model;

public class FullTimeEmployee extends Employee {
    private final double baseSalary;
    private final double bonus;

    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public EmployeeType getType() {
        return EmployeeType.FULLTIME;
    }

    public  double getBaseSalary() { return baseSalary; }

    public double getBonus() { return bonus; }

    // You can later add methods like assignBonus(), manageTeam(), etc.
}
