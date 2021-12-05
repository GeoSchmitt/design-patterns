package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountItemAmountMoreThanFive extends Discount{

    public DiscountItemAmountMoreThanFive(Discount next) {
        super(next);
    }

    public BigDecimal apply(Invoice invoice){
        return invoice.getPrice().multiply(new BigDecimal("0.1"));
    }

    public Boolean shouldApply(Invoice invoice){
        return invoice.getItensAmount() > 5;
    }

}
