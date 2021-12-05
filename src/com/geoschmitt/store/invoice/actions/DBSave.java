package com.geoschmitt.store.invoice.actions;

import com.geoschmitt.store.invoice.Order;

public class DBSave implements ActionGenerateOrder {

    public void execute(Order order){
        System.out.println("Saving invoice data");
    }

}
