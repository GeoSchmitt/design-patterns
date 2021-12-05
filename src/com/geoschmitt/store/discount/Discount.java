package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next){
        this.next = next;
    }

    public abstract BigDecimal calculate(Invoice invoice);
}
