package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountNone extends Discount {

    public DiscountNone() {
        super(null);
    }

    public BigDecimal apply(Invoice invoice){
        return BigDecimal.ZERO;
    }

    public Boolean shouldApply(Invoice invoice){
        return Boolean.TRUE;
    }
}
