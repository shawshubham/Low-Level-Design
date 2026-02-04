package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportedReport;

public class EmailLinkDeliveryStrategy implements DeliveryStrategy{
    @Override
    public DeliveryResult deliver(ExportedReport report, String destination) {
        // tutorial stub: “pretend email sent to email address with download link”
        String reference = "email-to=" + destination + ", file=" + report.getFileName();
        return new DeliveryResult(DeliveryChannel.EMAIL_LINK, reference);
    }
}
