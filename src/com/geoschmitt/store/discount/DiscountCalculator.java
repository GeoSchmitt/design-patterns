package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class DiscountCalculator {

    /**
     * Chain of Responsibility
     * https://refactoring.guru/design-patterns/chain-of-responsibility
     */
    public BigDecimal calculate(Invoice invoice){
       Discount discount = new DiscountItemAmountMoreThanFive(new DiscountPriceMoreThanFiveHundred(new DiscountNone()));
       return discount.calculate(invoice);
    }
}
