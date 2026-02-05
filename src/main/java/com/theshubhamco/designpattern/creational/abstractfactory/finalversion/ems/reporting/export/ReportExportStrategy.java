package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.export;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportedReport;

public interface ReportExportStrategy {
    ExportedReport export(EmployeeReport report);
}
