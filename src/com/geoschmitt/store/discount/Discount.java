package com.geoschmitt.store.discount;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next){
        this.next = next;
    }

    /**
     * Template Method
     * https://refactoring.guru/design-patterns/template-method
     */
    public BigDecimal calculate(Invoice invoice){
        if (this.shouldApply(invoice))
            return this.apply(invoice);
        return this.next.calculate(invoice);
    };

    protected abstract BigDecimal apply(Invoice invoice);
    public abstract Boolean shouldApply(Invoice invoice);

}
