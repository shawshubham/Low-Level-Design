package com.theshubhamco.designpattern.creational.abstractfactory.naive.delivery;

import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.DeliveryResult;
import com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model.ExportedReport;

public interface DeliveryStrategy {
    DeliveryResult deliver(ExportedReport report, String destination);
}
