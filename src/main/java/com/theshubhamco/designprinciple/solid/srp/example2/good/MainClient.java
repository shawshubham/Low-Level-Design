package com.theshubhamco.designprinciple.solid.srp.example2.good;

import com.theshubhamco.designprinciple.solid.srp.example2.good.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.srp.example2.good.model.Employee;
import com.theshubhamco.designprinciple.solid.srp.example2.good.model.FullTimeEmployee;
import com.theshubhamco.designprinciple.solid.srp.example2.good.model.InternEmployee;
import com.theshubhamco.designprinciple.solid.srp.example2.good.service.EmployeeFileSaver;
import com.theshubhamco.designprinciple.solid.srp.example2.good.service.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.srp.example2.good.service.EmployeeService;

//What Client will be performing!
public class MainClient {
    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham");
        Employee contractEmployee = new ContractEmployee("Ashwarya");
        Employee internEmployee = new InternEmployee("Arvind");

        EmployeeFormatter formatter = new EmployeeFormatter();
        EmployeeFileSaver fileSaver = new EmployeeFileSaver("employee.txt");

        EmployeeService service = new EmployeeService(formatter, fileSaver);

        service.save(fullTimeEmployee);
        service.save(contractEmployee);
        service.save(internEmployee);
    }
}