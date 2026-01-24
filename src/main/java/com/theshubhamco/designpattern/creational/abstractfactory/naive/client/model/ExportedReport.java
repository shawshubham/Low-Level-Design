package com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model;

public final class ExportedReport {
    private final byte[] payload;
    private final String fileName;
    private final String contentType;

    public ExportedReport(byte[] payload, String fileName, String contentType) {
        this.payload = payload;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public byte[] getPayload() { return payload; }
    public String getFileName() { return fileName; }
    public String getContentType() { return contentType; }
}