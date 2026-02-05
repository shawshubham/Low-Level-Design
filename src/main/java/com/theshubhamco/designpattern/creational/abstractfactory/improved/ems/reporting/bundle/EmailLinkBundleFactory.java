package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery.DeliveryStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.export.ReportExportStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportFormat;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.NotificationType;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.notification.NotificationStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.notification.NotificationStrategyFactory;

import java.util.Optional;

public class EmailLinkBundleFactory implements ReportBundleFactory {
    @Override
    public ReportExportStrategy createExportStrategy() {
        return ReportExportStrategyFactory.getStrategy(ExportFormat.PDF);
    }

    @Override
    public DeliveryStrategy createDeliveryStrategy() {
        return DeliveryStrategyFactory.getStrategy(DeliveryChannel.EMAIL_LINK);
    }

    @Override
    public Optional<NotificationStrategy> createNotificationStrategy() {
        return Optional.of(NotificationStrategyFactory.getStrategy(NotificationType.SMS));
    }
}
