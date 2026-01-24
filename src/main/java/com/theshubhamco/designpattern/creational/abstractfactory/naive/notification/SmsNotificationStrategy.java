package com.theshubhamco.designpattern.creational.abstractfactory.naive.notification;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryResult;

public class SmsNotificationStrategy implements NotificationStrategy{
    @Override
    public void notifyUser(DeliveryResult result, String target) {
        // tutorial stub
        System.out.println("SMS notification to " + target
                + " for " + result.getReference());
    }
}
