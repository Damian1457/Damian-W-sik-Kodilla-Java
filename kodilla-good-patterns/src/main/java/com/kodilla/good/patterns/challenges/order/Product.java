package com.kodilla.good.patterns.challenges.order;

import java.math.BigDecimal;

public class Product {

    private String product;
    private BigDecimal price;

    public Product(String product, BigDecimal price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
