package com.geoschmitt.store.tests;

import com.geoschmitt.store.invoice.Invoice;
import com.geoschmitt.store.tax.ICMS;
import com.geoschmitt.store.tax.ISS;
import com.geoschmitt.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxCalculatorTest {

    public static void main(String[] args){

        Invoice invoice = new Invoice(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("ISS: " + calculator.calculate(invoice, new ISS()));
        System.out.println("ICMS: " + calculator.calculate(invoice, new ICMS()));

    }
}
