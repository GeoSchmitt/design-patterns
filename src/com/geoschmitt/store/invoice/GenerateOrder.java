package com.geoschmitt.store.invoice;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {
    private String client;
    private BigDecimal invoicePrice;
    private int itensAmount;

    public GenerateOrder(String client, BigDecimal invoicePrice, int itensAmount) {
        this.client = client;
        this.invoicePrice = invoicePrice;
        this.itensAmount = itensAmount;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public int getItensAmount() {
        return itensAmount;
    }

    public void setItensAmount(int itensAmount) {
        this.itensAmount = itensAmount;
    }
}
