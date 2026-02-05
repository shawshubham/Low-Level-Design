package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.delivery.DeliveryStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.export.ReportExportStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model.ExportFormat;
import com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.notification.NotificationStrategy;

import java.util.Optional;

public final class EmailAttachmentBundleFactory implements ReportBundleFactory {
    @Override
    public ReportExportStrategy createExportStrategy() {
        return ReportExportStrategyFactory.getStrategy(ExportFormat.PDF);
    }

    @Override
    public DeliveryStrategy createDeliveryStrategy() {
        return DeliveryStrategyFactory.getStrategy(DeliveryChannel.EMAIL_ATTACHMENT);
    }

    @Override
    public Optional<NotificationStrategy> createNotificationStrategy() {
        return Optional.empty();
    }
}
