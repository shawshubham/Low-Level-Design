package com.theshubhamco.designpattern.creational.abstractfactory.naive.export;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.ExportFormat;

public class ReportExportStrategyFactory {
    public static ReportExportStrategy getStrategy(ExportFormat format) {
        switch (format) {
            case PDF: return new PdfReportExportStrategy();
            case CSV: return new CsvReportExportStrategy();
            case HTML: return new HtmlReportExportStrategy();
            default: throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
