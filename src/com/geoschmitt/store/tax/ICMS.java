package com.geoschmitt.store.tax;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class ICMS implements Tax {
    public BigDecimal calculate(Invoice invoice){
        return invoice.getPrice().multiply(new BigDecimal("0.1"));
    }
}
