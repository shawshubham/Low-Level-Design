package com.theshubhamco.designpattern.creational.abstractfactory.naive.notification;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryResult;

public class EmailNotificationStrategy implements NotificationStrategy{
    @Override
    public void notifyUser(DeliveryResult result, String target) {
        // tutorial stub
        System.out.println("EMAIL notification to " + target
                + " for " + result.getReference());
    }
}
