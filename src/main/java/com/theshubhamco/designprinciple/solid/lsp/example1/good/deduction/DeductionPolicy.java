package com.theshubhamco.designprinciple.solid.lsp.example1.good.deduction;

import com.theshubhamco.designprinciple.solid.lsp.example1.good.model.Employee;

public interface DeductionPolicy {
    public double calculateDeduction(Employee employee);
}
