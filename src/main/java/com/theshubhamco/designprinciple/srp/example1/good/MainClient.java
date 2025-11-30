package com.theshubhamco.designprinciple.srp.example1.good;

import com.theshubhamco.designprinciple.srp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.srp.example1.good.service.EmployeeService;

//Application
public class MainClient {
    public static void main(String args[]) {
        EmployeeService service = new EmployeeService();
        Employee fullTimeEmployee = new Employee("Shubham", "FULLTIME");
        Employee contractEmployee = new Employee("Rakesh", "CONTRACT");
        Employee internEmployee = new Employee("Mike", "INTERN");

        service.save(fullTimeEmployee);
        service.save(contractEmployee);
        service.save(internEmployee);
    }
}