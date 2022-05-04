package com.kodilla.stream.invoice.simple;

import java.util.Objects;

public final class SimpleProduct {

    private final String productName;

    private final double productDouble;

    public SimpleProduct(String productName, double productDouble) {
        this.productName = productName;
        this.productDouble = productDouble;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductDouble() {
        return productDouble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;
        SimpleProduct that = (SimpleProduct) o;
        return productName.equals(that.productName);
    }

}
