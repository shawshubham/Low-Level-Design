package com.theshubhamco.designpattern.creational.abstractfactory.naive.notification;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryResult;

public interface NotificationStrategy {
    public void notifyUser(DeliveryResult result, String target);
}
