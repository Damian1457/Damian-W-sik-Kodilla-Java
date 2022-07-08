package com.kodilla.stream.invoicesimple2;

import java.util.Objects;

public final class SompleProduct {

    private final String productName;
    private final double productPrice;

    public SompleProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SompleProduct that = (SompleProduct) o;
        return Double.compare(that.productPrice, productPrice) == 0 && Objects.equals(productName, that.productName);
    }

}
