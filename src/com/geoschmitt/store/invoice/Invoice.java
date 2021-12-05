package com.geoschmitt.store.invoice;

import java.math.BigDecimal;

public class Invoice {

    private BigDecimal price;

    public Invoice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

