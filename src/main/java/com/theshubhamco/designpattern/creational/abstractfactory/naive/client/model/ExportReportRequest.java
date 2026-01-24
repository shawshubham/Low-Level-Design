package com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model;

public class ExportReportRequest {
    private final ExportFormat format;
    private final DeliveryChannel deliveryChannel;
    private final NotificationType notificationType; //optional

    // delivery targets
    private final String deliveryAddress;   // email OR download path
    private final String notificationTarget; // phone/email/deviceId

    public ExportReportRequest(ExportFormat format,
                               DeliveryChannel deliveryChannel,
                               NotificationType notificationType,
                               String deliveryAddress,
                               String notificationTarget) {
        this.format = format;
        this.deliveryChannel = deliveryChannel;
        this.notificationType = notificationType;
        this.deliveryAddress = deliveryAddress;
        this.notificationTarget = notificationTarget;
    }

    public ExportFormat getFormat() { return format; }
    public DeliveryChannel getDeliveryChannel() { return deliveryChannel; }
    public NotificationType getNotificationType() { return notificationType; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public String getNotificationTarget() { return notificationTarget; }
}
