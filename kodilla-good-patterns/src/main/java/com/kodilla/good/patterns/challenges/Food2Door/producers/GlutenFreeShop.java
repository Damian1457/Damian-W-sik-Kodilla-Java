package com.kodilla.good.patterns.challenges.Food2Door.producers;

import com.kodilla.good.patterns.challenges.Food2Door.products.Products;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producers {

    private final Map<String, Products> orderGlutenFreeShop = new HashMap<>();

    @Override
    public boolean process(Products products, int quantity) {

        System.out.println("GlutenFreeShop is adding an order.");

        String orderId = LocalDate.now().toString().replace("-", ":");

        orderGlutenFreeShop.put(orderId, products);
        System.out.println(orderGlutenFreeShop);
        return false;
    }
}
