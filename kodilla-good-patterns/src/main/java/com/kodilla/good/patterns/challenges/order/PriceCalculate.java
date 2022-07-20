package com.kodilla.good.patterns.challenges.order;



public class PriceCalculate implements PriceCalculatepriceCalculate {

    @Override
    public double price(Product product) {
        return product.getPrice() * product.getAmountOfProducts();
    }

}
