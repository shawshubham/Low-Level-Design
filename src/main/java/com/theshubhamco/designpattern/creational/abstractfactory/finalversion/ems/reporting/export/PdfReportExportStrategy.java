package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.export;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportedReport;

public class PdfReportExportStrategy implements ReportExportStrategy {

    @Override
    public ExportedReport export(EmployeeReport report) {
        String fileName = report.getName() + "-report.pdf";
        byte[] payload = ("PDF_REPORT_FOR_" + report.getName()).getBytes();
        return new ExportedReport(payload, fileName, "application/pdf");
    }
}
