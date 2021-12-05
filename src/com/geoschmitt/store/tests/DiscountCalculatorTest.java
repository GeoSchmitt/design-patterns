package com.geoschmitt.store.tests;

import com.geoschmitt.store.discount.DiscountCalculator;
import com.geoschmitt.store.invoice.Invoice;
import com.geoschmitt.store.tax.ICMS;
import com.geoschmitt.store.tax.ISS;
import com.geoschmitt.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class DiscountCalculatorTest {

    public static void main(String[] args){

        Invoice invoice = new Invoice(new BigDecimal("100"), 1);
        Invoice invoice2 = new Invoice(new BigDecimal("1000"), 1);
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Discount: " + calculator.calculate(invoice));
        System.out.println("Discount: " + calculator.calculate(invoice2));

    }
}
