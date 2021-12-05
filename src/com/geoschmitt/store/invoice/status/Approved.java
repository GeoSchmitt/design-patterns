package com.geoschmitt.store.invoice.status;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class Approved extends Status{
    
    @Override
    public BigDecimal calculateExtraDiscount(Invoice invoice){
        return invoice.getPrice().multiply(new BigDecimal("0.1"));
    }

    @Override
    public void finish(Invoice invoice){
        invoice.setStatus(new Finished());
    }
}
