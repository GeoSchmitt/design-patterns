package com.geoschmitt.store.invoice;

import com.geoschmitt.store.invoice.status.InAnalysis;
import com.geoschmitt.store.invoice.status.Status;

import java.math.BigDecimal;

public class Invoice {

    private BigDecimal price;
    private int itensAmount;
    private Status status;

    public Invoice(BigDecimal price, int itensAmount) {
        this.price = price;
        this.itensAmount = itensAmount;
        this.status = new InAnalysis();
    }

    public int getItensAmount() {
        return itensAmount;
    }

    public void setItensAmount(int itensAmount) {
        this.itensAmount = itensAmount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void extraDiscount(){
        BigDecimal discount = this.status.calculateExtraDiscount(this);
        this.price = this.price.subtract(discount);
    }

    public void approve(){
        this.status.approve(this);
    }

    public void disapprove(){
        this.status.disapprove(this);
    }

    public void finish(){
        this.status.finish(this);
    }
}

