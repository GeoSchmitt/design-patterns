package com.geoschmitt.store.invoice;

import java.time.LocalDateTime;

public class Order {

    private String client;
    private LocalDateTime date;
    private Invoice invoice;

    public Order(String client, LocalDateTime date, Invoice invoice) {
        this.client = client;
        this.date = date;
        this.invoice = invoice;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
