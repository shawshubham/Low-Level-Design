package com.theshubhamco.designprinciple.solid.ocp.example1.bad;

import com.theshubhamco.designprinciple.solid.ocp.example1.bad.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example1.bad.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example1.bad.model.FullTimeEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example1.bad.model.InternEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example1.bad.service.*;

import java.util.logging.Logger;

public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham");
        Employee contractEmployee = new ContractEmployee("Ashwarya");
        Employee internEmployee = new InternEmployee("Arvind");

        EmployeeFormatter formatter = new EmployeeFormatter();

        EmployeeFileSaver fileSaver = new EmployeeFileSaver("employee.txt");
        EmployeeDBSaver dbSaver = new EmployeeDBSaver();
        EmployeeRemoteAPISaver remoteAPISaver = new EmployeeRemoteAPISaver();

        EmployeeService fileSaverService = new EmployeeService(formatter, fileSaver);
        EmployeeService dbSaverService = new EmployeeService(formatter, dbSaver);
        EmployeeService remoteAPISaverService = new EmployeeService(formatter, remoteAPISaver);

        logger.info("Saving employees...");
        fileSaverService.save(fullTimeEmployee, "FILE");
        dbSaverService.save(contractEmployee, "DB");
        remoteAPISaverService.save(internEmployee, "REMOTE");
        logger.info("Finished saving employees.");
    }
}
