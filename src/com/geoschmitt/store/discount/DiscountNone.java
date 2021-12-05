package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountNone extends Discount {

    public DiscountNone() {
        super(null);
    }

    public BigDecimal calculate(Invoice invoice){
        return BigDecimal.ZERO;
    }
}
