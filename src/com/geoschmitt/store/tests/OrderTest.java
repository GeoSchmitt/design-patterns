package com.geoschmitt.store.tests;

import com.geoschmitt.store.invoice.GenerateOrder;
import com.geoschmitt.store.invoice.GenerateOrderHandler;
import com.geoschmitt.store.invoice.actions.DBSave;
import com.geoschmitt.store.invoice.actions.SendEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTest {
    public static void main(String[] args){
        GenerateOrder order = new GenerateOrder("Geo",new BigDecimal("600"), 4);
        GenerateOrderHandler handler = new GenerateOrderHandler(Arrays.asList(new DBSave(), new SendEmail()));
        handler.execute(order);
    }
}
