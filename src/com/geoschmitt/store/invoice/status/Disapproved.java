package com.geoschmitt.store.invoice.status;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public class Disapproved extends Status{
    @Override
    public void finish(Invoice invoice){
        invoice.setStatus(new Finished());
    }
}
