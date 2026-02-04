package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model;

public class ExportReportRequest {
    private final ReportBundleType bundleType;

    // destinations (some bundles use some of them)
    private final String deliveryAddress;   // email OR download path
    private final String notificationTarget; // phone / email /push token

    // bundle-specific config
    private final ExportFormat format;

    public ExportReportRequest(ReportBundleType bundleType,
                               ExportFormat format,
                               String deliveryAddress,
                               String notificationTarget) {
        this.bundleType = bundleType;
        this.format = format;
        this.deliveryAddress = deliveryAddress;
        this.notificationTarget = notificationTarget;
    }

    public ReportBundleType getBundleType() { return bundleType; }
    public ExportFormat getFormat() { return format; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public String getNotificationTarget() { return notificationTarget; }
}
