package com.theshubhamco.designprinciple.srp.example1.bad;

import com.theshubhamco.designprinciple.srp.example1.bad.model.Employee;

public class MainClient {
    public static void main(String args[]) {
        Employee fullTimeEmployee = new Employee("Shubham", "FULLTIME");
        Employee contractEmployee = new Employee("Ashwarya", "CONTRACT");
        Employee internEmployee = new Employee("Arvind", "INTERN");

        fullTimeEmployee.save();
        contractEmployee.save();
        internEmployee.save();
    }
}
