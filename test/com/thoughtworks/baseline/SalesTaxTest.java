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

}
