package com.theshubhamco.designprinciple.srp.finalrefactoredversion;

import com.theshubhamco.designprinciple.srp.finalrefactoredversion.model.*;
import com.theshubhamco.designprinciple.srp.finalrefactoredversion.service.EmployeeFileSaver;
import com.theshubhamco.designprinciple.srp.finalrefactoredversion.service.EmployeeFormatter;
import com.theshubhamco.designprinciple.srp.finalrefactoredversion.service.EmployeeService;

import java.util.logging.Logger;

public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham");
        Employee contractEmployee = new ContractEmployee("Ashwarya");
        Employee internEmployee = new InternEmployee("Arvind");

        EmployeeFormatter formatter = new EmployeeFormatter();
        EmployeeFileSaver fileSaver = new EmployeeFileSaver("employee.txt");

        EmployeeService service = new EmployeeService(formatter, fileSaver);

        logger.info("Saving employees...");
        service.save(fullTimeEmployee);
        service.save(contractEmployee);
        service.save(internEmployee);
        logger.info("Finished saving employees.");
    }
}
