package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.notification;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.DeliveryResult;

public interface NotificationStrategy {
    public void notifyUser(DeliveryResult result, String target);
}
