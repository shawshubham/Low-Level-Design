package com.theshubhamco.designpattern.creational.abstractfactory.finalversion.ems.reporting.model;

public sealed interface ExportReportRequest
        permits PortalDownloadRequest, EmailAttachmentRequest, EmailLinkRequest{ }
