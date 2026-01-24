package com.theshubhamco.designpattern.creational.abstractfactory.naive.export;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.ExportedReport;

public interface ReportExportStrategy {
    ExportedReport export(EmployeeReport report);
}
