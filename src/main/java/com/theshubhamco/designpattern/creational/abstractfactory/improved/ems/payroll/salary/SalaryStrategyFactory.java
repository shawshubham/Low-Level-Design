package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.payroll.salary;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.employee.model.EmployeeType;

import java.util.Map;

public class SalaryStrategyFactory {
    private static final Map<EmployeeType, SalaryCalculationStrategy> strategyMap =
            Map.of(EmployeeType.FULLTIME, new FullTimeSalaryStrategy(),
                   EmployeeType.CONTRACT, new ContractSalaryStrategy(),
                   EmployeeType.INTERN, new InternSalaryStrategy(),
                   EmployeeType.COMMISSIONED, new CommissionedSalaryStrategy());

    public static SalaryCalculationStrategy getSalaryCalculationStrategy(EmployeeType employeeType) {
        return strategyMap.get(employeeType);
    }
}
