package com.theshubhamco.designprinciple.solid.ocp.example2.good.salary;

import com.theshubhamco.designprinciple.solid.ocp.example2.good.model.EmployeeType;

import java.util.Map;

public class SalaryStrategyFactory {
    private static final Map<EmployeeType, SalaryCalculationStrategy> strategyMap =
           Map.of(EmployeeType.FULLTIME, new FullTimeSalaryStrategy(),
                   EmployeeType.CONTRACT, new ContractSalaryStrategy(),
                   EmployeeType.INTERN, new InternSalaryStrategy());

    public static SalaryCalculationStrategy getSalaryCalculationStrategy(EmployeeType employeeType) {
        return strategyMap.get(employeeType);
    }
}
