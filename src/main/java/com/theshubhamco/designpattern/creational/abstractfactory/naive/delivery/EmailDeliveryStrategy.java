package com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.ExportedReport;

public class EmailDeliveryStrategy implements DeliveryStrategy{
    @Override
    public DeliveryResult deliver(ExportedReport report, String destination) {
        // tutorial stub: “pretend sent”
        String reference = "email-to=" + destination + ", file=" + report.getFileName();
        return new DeliveryResult(DeliveryChannel.EMAIL, reference);
    }
}
