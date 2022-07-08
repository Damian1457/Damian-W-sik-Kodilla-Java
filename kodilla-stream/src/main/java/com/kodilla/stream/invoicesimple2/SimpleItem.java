package com.kodilla.stream.invoicesimple2;

public final class SimpleItem {

    private final SompleProduct product;
    private final double quantity;

    public SimpleItem(SompleProduct product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SompleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }

}
