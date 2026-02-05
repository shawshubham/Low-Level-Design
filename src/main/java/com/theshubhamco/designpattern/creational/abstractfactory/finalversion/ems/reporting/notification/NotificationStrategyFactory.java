package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.notification;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.NotificationType;

public class NotificationStrategyFactory {
    public static NotificationStrategy getStrategy(NotificationType type){
        switch (type) {
            case EMAIL:
                return new EmailNotificationStrategy();
            case SMS:
                return new SmsNotificationStrategy();
            case PUSH:
                return new PushNotificationStrategy();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
