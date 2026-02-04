package com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.improved.ems.reporting.model.ExportedReport;

public interface DeliveryStrategy {
    DeliveryResult deliver(ExportedReport report, String destination);
}
