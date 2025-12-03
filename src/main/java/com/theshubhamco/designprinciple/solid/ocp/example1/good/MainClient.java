package com.theshubhamco.designprinciple.solid.ocp.example1.good;

import com.theshubhamco.designprinciple.solid.ocp.example1.good.formatter.EmployeeFormatter;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.model.ContractEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.model.Employee;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.model.FullTimeEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.model.InternEmployee;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.persistence.EmployeeAPIPersistenceStrategy;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.persistence.EmployeeDBPersistenceStrategy;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.persistence.EmployeeFilePersistenceStrategy;
import com.theshubhamco.designprinciple.solid.ocp.example1.good.service.EmployeeService;

import java.util.logging.Logger;

public class MainClient {
    private static final Logger logger = Logger.getLogger(MainClient.class.getName());

    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shubham");
        Employee contractEmployee = new ContractEmployee("Ashwarya");
        Employee internEmployee = new InternEmployee("Arvind");

        EmployeeFormatter formatter = new EmployeeFormatter();

        EmployeeService fileSaverService = new EmployeeService(formatter, new EmployeeFilePersistenceStrategy("employee.txt"));
        EmployeeService dbSaverService = new EmployeeService(formatter, new EmployeeDBPersistenceStrategy());
        EmployeeService remoteAPISaverService = new EmployeeService(formatter, new EmployeeAPIPersistenceStrategy());

        logger.info("Saving employees...");
        fileSaverService.save(fullTimeEmployee);
        dbSaverService.save(contractEmployee);
        remoteAPISaverService.save(internEmployee);
        logger.info("Finished saving employees.");
    }
}
