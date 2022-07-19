package com.kodilla.good.patterns.challenges.order;



public class PriceCalculate {

    public double priceCalculate(Product product) {
        return product.getPrice() * product.getAmountOfProducts();
    }

}
