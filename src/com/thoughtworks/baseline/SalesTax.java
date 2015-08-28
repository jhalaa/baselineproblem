package com.thoughtworks.baseline;

import java.util.Arrays;
import java.util.List;

public class SalesTax {
    private String str[];
    private int quantity;
    SalesTax(String s) {
        str = s.split(" ");
        quantity = Integer.parseInt(str[0]);
    }

    public double basicSalesTax() {
        List l1 = Arrays.asList(str);
        if (l1.contains("book") || l1.contains("pills") || l1.contains("chocolates") || l1.contains("chocolate"))
            return 0.0;
        return 10.0;
    }

    public double importTax() {
        List l1 = Arrays.asList(str);
        if (l1.contains("imported"))
            return 5;
        return 0;
    }
}
