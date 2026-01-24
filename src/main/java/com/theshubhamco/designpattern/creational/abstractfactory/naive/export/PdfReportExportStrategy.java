package com.theshubhamco.designpattern.creational.abstractfactory.naive.export;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.EmployeeReport;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.ExportedReport;

public class PdfReportExportStrategy implements ReportExportStrategy {

    @Override
    public ExportedReport export(EmployeeReport report) {
        String fileName = report.getName() + "-report.pdf";
        byte[] payload = ("PDF_REPORT_FOR_" + report.getName()).getBytes();
        return new ExportedReport(payload, fileName, "application/pdf");
    }
}
