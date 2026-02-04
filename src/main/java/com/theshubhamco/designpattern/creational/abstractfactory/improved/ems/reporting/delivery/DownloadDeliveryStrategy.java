package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportedReport;

public class DownloadDeliveryStrategy implements DeliveryStrategy {
    @Override
    public DeliveryResult deliver(ExportedReport report, String destination) {
        // tutorial stub: “pretend saved”
        String reference = "download-path=" + destination + report.getFileName();
        return new DeliveryResult(DeliveryChannel.DOWNLOAD, reference);
    }
}
