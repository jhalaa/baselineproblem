package com.thoughtworks.baseline;

public class SalesTax {

    private String productType;
    SalesTax(String s)
    {
        productType=s;

    }
    public double basicSalesTax()
    {
        return 0.0;
    }
}
