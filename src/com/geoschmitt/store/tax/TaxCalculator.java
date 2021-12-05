package com.geoschmitt.store.tax;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class TaxCalculator {

    /**
     * Strategy - Gang of Four
     * https://refactoring.guru/design-patterns/strategy
     */
    public BigDecimal calculate(Invoice invoice, Tax tax){
        return  tax.calculate(invoice);
    }
}
