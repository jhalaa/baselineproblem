package com.thoughtworks.baseline;

import java.util.Arrays;
import java.util.List;

public class SalesTax {
    String str[];
    SalesTax(String s)
    {
        str=s.split(" ");
    }
    public double basicSalesTax()
    {
        List l1= Arrays.asList(str);
        if(l1.contains("book") || l1.contains("pills") || l1.contains("chocolates") || l1.contains("chocolate") )
            return 0.0;
        return 1.0;
    }

    public double importTax() {
        return 0;
    }
}
