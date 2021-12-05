package com.geoschmitt.store.invoice;

import java.math.BigDecimal;

public class Invoice {

    private BigDecimal price;

    private int itensAmount;

    public Invoice(BigDecimal price, int itensAmount) {
        this.price = price;
        this.itensAmount = itensAmount;
    }

    public int getItensAmount() {
        return itensAmount;
    }

    public void setItensAmount(int itensAmount) {
        this.itensAmount = itensAmount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

