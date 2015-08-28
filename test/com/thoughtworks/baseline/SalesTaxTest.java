package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void basicSalesTaxIfItemIsBookIsZero() {
        SalesTax salestax=new SalesTax("book");
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
    public void basicSalesTaxIfItemIsSingleChocolateIsZero() {
        SalesTax salestax=new SalesTax("chocolate");
        assertEquals(0.0,salestax.basicSalesTax());

    }

}
