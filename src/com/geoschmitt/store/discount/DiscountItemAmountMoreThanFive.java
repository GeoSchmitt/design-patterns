package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountItemAmountMoreThanFive extends Discount{

    public DiscountItemAmountMoreThanFive(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Invoice invoice){
        if(invoice.getItensAmount() > 5)
            return invoice.getPrice().multiply(new BigDecimal("0.1"));
        return next.calculate(invoice);
    }

}
