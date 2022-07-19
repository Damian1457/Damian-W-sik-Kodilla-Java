package com.kodilla.good.patterns.challenges.order;

public class Product {

    private String product;
    private double price;
    private int amountOfProducts;

    public Product(String product, double price, int amountOfProducts) {
        this.product = product;
        this.price = price;
        this.amountOfProducts = amountOfProducts;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", amountOfProducts=" + amountOfProducts +
                '}';
    }
}
