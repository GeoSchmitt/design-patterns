package com.geoschmitt.store.invoice.actions;

import com.geoschmitt.store.invoice.Order;

public interface ActionGenerateOrder {
    public void execute(Order order);
}
