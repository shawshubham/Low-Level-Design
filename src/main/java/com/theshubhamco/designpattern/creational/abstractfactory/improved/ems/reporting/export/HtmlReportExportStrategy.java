package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.export;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportedReport;

public class HtmlReportExportStrategy implements ReportExportStrategy {
    @Override
    public ExportedReport export(EmployeeReport report) {
        String fileName = report.getName() + "-report.html";
        byte[] payload = ("HTML_REPORT_FOR_" + report.getName()).getBytes();
        return new ExportedReport(payload, fileName, "application/html");
    }
}
