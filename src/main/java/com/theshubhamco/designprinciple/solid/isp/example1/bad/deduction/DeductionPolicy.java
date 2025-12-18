package com.theshubhamco.designprinciple.solid.isp.example1.bad.deduction;

import com.theshubhamco.designprinciple.solid.isp.example1.bad.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
