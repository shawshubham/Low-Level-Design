package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model;

public record EmailLinkRequest (String email, String phone) implements ExportReportRequest { }
