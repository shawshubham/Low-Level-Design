package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.bundle;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery.DeliveryStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery.DeliveryStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.export.ReportExportStrategy;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.export.ReportExportStrategyFactory;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryChannel;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportFormat;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.notification.NotificationStrategy;

import java.util.Optional;

public class EmailAttachmentBundleFactory implements ReportBundleFactory {
    @Override
    public ReportExportStrategy getExportStrategy() {
        return ReportExportStrategyFactory.getStrategy(ExportFormat.PDF);
    }

    @Override
    public DeliveryStrategy getDeliveryStrategy() {
        return DeliveryStrategyFactory.getStrategy(DeliveryChannel.EMAIL_ATTACHMENT);
    }

    @Override
    public Optional<NotificationStrategy> getNotificationStrategy() {
        return Optional.empty();
    }
}
