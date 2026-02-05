package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportReportRequest;

public class ReportBundleFactoryProvider {

    public static ReportBundleFactory getBundleFactory(ExportReportRequest request) {
        return switch (request.getBundleType()) {
            case PORTAL_DOWNLOAD -> new PortalDownloadBundleFactory(request.getFormat());
            case EMAIL_ATTACHMENT -> new EmailAttachmentBundleFactory();
            case EMAIL_LINK -> new EmailLinkBundleFactory();
        };
    }
}

