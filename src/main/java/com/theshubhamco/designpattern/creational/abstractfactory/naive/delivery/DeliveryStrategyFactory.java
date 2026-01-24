package com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryChannel;

public class DeliveryStrategyFactory {
    public static DeliveryStrategy getStrategy(DeliveryChannel deliveryChannel){
        switch (deliveryChannel) {
            case EMAIL:
                return new EmailDeliveryStrategy();
            case DOWNLOAD:
                return new DownloadDeliveryStrategy();
            default:
                throw new IllegalArgumentException("Unknown delivery channel: " + deliveryChannel);
        }
    }
}
