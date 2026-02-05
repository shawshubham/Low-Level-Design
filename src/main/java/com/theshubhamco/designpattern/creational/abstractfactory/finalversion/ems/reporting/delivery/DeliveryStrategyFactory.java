package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.DeliveryChannel;

public class DeliveryStrategyFactory {
    public static DeliveryStrategy getStrategy(DeliveryChannel deliveryChannel) {
        switch (deliveryChannel) {
            case EMAIL_ATTACHMENT:
                return new EmailAttachmentDeliveryStrategy();
            case EMAIL_LINK:
                return new EmailLinkDeliveryStrategy();
            case DOWNLOAD:
                return new DownloadDeliveryStrategy();
            default:
                throw new IllegalArgumentException("Unknown delivery channel: " + deliveryChannel);
        }
    }
}
