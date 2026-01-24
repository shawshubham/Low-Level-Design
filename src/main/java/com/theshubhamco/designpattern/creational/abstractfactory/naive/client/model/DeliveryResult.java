package com.theshubhamco.designpattern.creational.abstractfactory.naive.client.model;

public final class DeliveryResult {
    private final DeliveryChannel channel;
    private final String reference; // e.g. email id, download path, etc.

    public DeliveryResult(DeliveryChannel channel, String reference) {
        this.channel = channel;
        this.reference = reference;
    }

    public DeliveryChannel getChannel() { return channel; }
    public String getReference() { return reference; }
}
