package com.theshubhamco.designprinciple.srp.example2.good;

import com.theshubhamco.designprinciple.srp.example2.good.model.*;
import com.theshubhamco.designprinciple.srp.example2.good.service.*;

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