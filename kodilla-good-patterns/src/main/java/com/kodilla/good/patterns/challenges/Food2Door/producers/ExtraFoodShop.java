package com.kodilla.good.patterns.challenges.Food2Door.producers;

import com.kodilla.good.patterns.challenges.Food2Door.products.Products;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producers {

    private final Map<String, Products> orderExtraFoodShoop = new HashMap<>();

    @Override
    public boolean process(Products products, int quantity) {

        System.out.println("Extra food is adding an order.");

        String orderId = LocalDate.now().toString().replace("-", ":");

        orderExtraFoodShoop.put(orderId, products);
        System.out.println(orderExtraFoodShoop);
        return false;

    }
}
