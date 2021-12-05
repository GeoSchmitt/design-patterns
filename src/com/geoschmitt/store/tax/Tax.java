package com.geoschmitt.store.tax;

import com.geoschmitt.store.invoice.Invoice;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Invoice invoice);
}
