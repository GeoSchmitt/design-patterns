package com.geoschmitt.store.invoice.status;

import com.geoschmitt.store.exceptions.DomainException;
import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public abstract class Status {

    /**
     * State
     * https://refactoring.guru/design-patterns/state
     */

    public BigDecimal calculateExtraDiscount(Invoice invoice){
        return BigDecimal.ZERO;
    }

    public void approve(Invoice invoice){
        throw new DomainException("This invoice can not be approved in the current status");
    }

    public void disapprove(Invoice invoice){
        throw new DomainException("This invoice can not be disapproved in the current status");
    }

    public void finish(Invoice invoice){
        throw new DomainException("This invoice can not be finished in the current status");
    }
}
