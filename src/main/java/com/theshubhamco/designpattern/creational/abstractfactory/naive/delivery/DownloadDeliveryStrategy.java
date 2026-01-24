package com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.ExportedReport;

public class DownloadDeliveryStrategy implements DeliveryStrategy{
    @Override
    public DeliveryResult deliver(ExportedReport report, String destination) {
        // tutorial stub: “pretend saved”
        String reference = "download-path=" + destination + report.getFileName();
        return new DeliveryResult(DeliveryChannel.DOWNLOAD, reference);
    }
}
