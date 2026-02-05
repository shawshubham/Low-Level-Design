package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.EmailAttachmentRequest;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.EmailLinkRequest;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportReportRequest;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.PortalDownloadRequest;

public class ReportBundleFactoryProvider {

    public static ReportBundleFactory getBundleFactory(ExportReportRequest request) {
        return switch (request) {
            case PortalDownloadRequest r -> new PortalDownloadBundleFactory(r.format());
            case EmailAttachmentRequest r -> new EmailAttachmentBundleFactory();
            case EmailLinkRequest r -> new EmailLinkBundleFactory();
        };
    }
}

