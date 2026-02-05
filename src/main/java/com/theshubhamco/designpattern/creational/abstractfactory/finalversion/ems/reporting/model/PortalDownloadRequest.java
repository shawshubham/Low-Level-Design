package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model;

public record PortalDownloadRequest(ExportFormat format, String downloadPath, String pushToken)
        implements ExportReportRequest {
}
