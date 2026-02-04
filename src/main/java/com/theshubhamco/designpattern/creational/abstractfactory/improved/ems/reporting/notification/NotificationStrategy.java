package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.notification;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryResult;

public interface NotificationStrategy {
    public void notifyUser(DeliveryResult result, String target);
}
