package com.geoschmitt.store.invoice;

import com.geoschmitt.store.invoice.actions.ActionGenerateOrder;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionGenerateOrder> actions;

    /**
     * Observer
     * https://refactoring.guru/design-patterns/observer
     */
    public GenerateOrderHandler(List<ActionGenerateOrder> actions) {
        this.actions = actions;
    }

    /**
     * Command (Command Handler)
     * https://refactoring.guru/design-patterns/command
     */
    public void execute(GenerateOrder data){
        Invoice invoice = new Invoice(data.getInvoicePrice(), data.getItensAmount());
        Order order = new Order(data.getClient(), LocalDateTime.now(), invoice);

        actions.forEach(a -> a.execute(order));
    }
}
