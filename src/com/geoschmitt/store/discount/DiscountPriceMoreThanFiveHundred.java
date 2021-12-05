package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountPriceMoreThanFiveHundred extends Discount{

    public DiscountPriceMoreThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal apply(Invoice invoice){
        return invoice.getPrice().multiply(new BigDecimal("0.05"));
    }

    public Boolean shouldApply(Invoice invoice){
        return invoice.getPrice().compareTo(new BigDecimal(500)) > 0;
    }
}
