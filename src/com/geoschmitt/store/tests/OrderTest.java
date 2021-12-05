package com.geoschmitt.store.tests;

import com.geoschmitt.store.invoice.GenerateOrder;
import com.geoschmitt.store.invoice.GenerateOrderHandler;
import com.geoschmitt.store.invoice.Invoice;
import com.geoschmitt.store.invoice.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderTest {
    public static void main(String[] args){
        GenerateOrder order = new GenerateOrder("Geo",new BigDecimal("600"), 4);
        GenerateOrderHandler handler = new GenerateOrderHandler(/*Dependencies*/);
        handler.execute(order);
    }
}
