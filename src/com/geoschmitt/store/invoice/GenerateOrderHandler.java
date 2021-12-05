package com.geoschmitt.store.invoice;

import java.time.LocalDateTime;

public class GenerateOrderHandler {

    /**
     * Command (Command Handler)
     * https://refactoring.guru/design-patterns/command
     */
    public void execute(GenerateOrder data){
        Invoice invoice = new Invoice(data.getInvoicePrice(), data.getItensAmount());
        Order order = new Order(data.getClient(), LocalDateTime.now(), invoice);
    }
}
