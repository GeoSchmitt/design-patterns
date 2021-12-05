package com.geoschmitt.store.invoice.status;

import com.geoschmitt.store.exceptions.DomainException;
import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class InAnalysis extends Status{

    @Override
    public BigDecimal calculateExtraDiscount(Invoice invoice){
        return invoice.getPrice().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Invoice invoice){
        invoice.setStatus(new Approved());
    }

    @Override
    public void disapprove(Invoice invoice){
        invoice.setStatus(new Disapproved());
    }
}
