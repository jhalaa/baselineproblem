package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void basicSalesTaxIfItemIsBookIsZero() {
        SalesTax salestax=new SalesTax("1 book at 12.49");
        assertEquals(0.0,salestax.basicSalesTax());

    }

    @Test
    public void basicSalesTaxIfItemIsMedicinesIsZero() {
        SalesTax salestax=new SalesTax("pills");
        assertEquals(0.0,salestax.basicSalesTax());
    }

    @Test
    public void basicSalesTaxIfItemIsChocolatesIsZero() {
        SalesTax salestax=new SalesTax("chocolates");
        assertEquals(0.0,salestax.basicSalesTax());
    }

    @Test
    public void basicSalesTaxIfSingleItemIsChocolatesIsZero() {
        SalesTax salestax=new SalesTax("chocolate");
        assertEquals(0.0,salestax.basicSalesTax());
    }

    @Test
    public void importTaxIfItemIsNotImportedIsZero() {
        SalesTax salestax=new SalesTax("chocolate");
        assertEquals(0.0,salestax.importTax());
    }

    @Test
    public void importTaxIfItemIsImportedIsZero() {
        SalesTax salestax=new SalesTax("imported chocolate");
        assertEquals(5.0,salestax.importTax());
    }

}
