package com.geoschmitt.store.invoice.actions;

import com.geoschmitt.store.invoice.Order;

public class SendEmail implements ActionGenerateOrder{

    public void execute(Order order){
        System.out.println("Sending E-mail with invoice data");
    }

}
