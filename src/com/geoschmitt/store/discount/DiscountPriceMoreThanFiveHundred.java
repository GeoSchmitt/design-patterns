package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountPriceMoreThanFiveHundred extends Discount{

    public DiscountPriceMoreThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Invoice invoice){
        if(invoice.getPrice().compareTo(new BigDecimal(500)) > 0)
            return invoice.getPrice().multiply(new BigDecimal("0.05"));
        return next.calculate(invoice);
    }
}
