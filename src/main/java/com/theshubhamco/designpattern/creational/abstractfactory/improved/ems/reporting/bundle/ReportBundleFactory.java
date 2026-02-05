package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.notification.NotificationStrategy;

import java.util.Optional;

public interface ReportBundleFactory {
    ReportExportStrategy createExportStrategy();
    DeliveryStrategy createDeliveryStrategy();
    Optional<NotificationStrategy> createNotificationStrategy();
}
