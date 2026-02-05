package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.delivery.DeliveryStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.export.ReportExportStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportFormat;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.NotificationType;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.notification.NotificationStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.notification.NotificationStrategyFactory;

import java.util.Optional;

public class PortalDownloadBundleFactory implements ReportBundleFactory {
    private final ExportFormat format;

    public PortalDownloadBundleFactory(ExportFormat format) {
        this.format = format;
    }

    @Override
    public ReportExportStrategy createExportStrategy() {
        return ReportExportStrategyFactory.getStrategy(format);
    }

    @Override
    public DeliveryStrategy createDeliveryStrategy() {
        return DeliveryStrategyFactory.getStrategy(DeliveryChannel.DOWNLOAD);
    }

    @Override
    public Optional<NotificationStrategy> createNotificationStrategy() {
        return Optional.of(NotificationStrategyFactory.getStrategy(NotificationType.PUSH));
    }
}
