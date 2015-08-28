package com.thoughtworks.baseline;

public class SalesTax {

    private String productType;
    SalesTax(String s)
    {
        productType=s;

    }
    public double basicSalesTax()
    {
        if(productType == "book" || productType == "pills" || productType == "chocolates" )
            return 0.0;
        return 1.0;
    }
}
