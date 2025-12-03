package com.theshubhamco.designprinciple.solid.srp.example2.bad;

import com.theshubhamco.designprinciple.solid.srp.example2.bad.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.srp.example2.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.srp.example2.bad.model.FullTimeEmployee;
import com.theshubhamco.designprinciple.solid.srp.example2.bad.model.InternEmployee;

public class MainClient {
    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham");
        Employee contractEmployee = new ContractEmployee("Ashwarya");
        Employee internEmployee = new InternEmployee("Arvind");

        fullTimeEmployee.save();
        contractEmployee.save();
        internEmployee.save();
    }
}