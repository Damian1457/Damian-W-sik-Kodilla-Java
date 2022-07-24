package com.kodilla.good.patterns.challenges.Food2Door.producers;

import com.kodilla.good.patterns.challenges.Food2Door.products.FoodProducts;
import com.kodilla.good.patterns.challenges.Food2Door.products.Products;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producers {

    private final Map<String, Products> orderHealtyShop = new HashMap<>();


    @Override
    public boolean process(Products products, int quantity) {

        System.out.println("HealthyShop is adding an order.");

        String orderId = LocalDate.now().toString().replace("-", ":");

        orderHealtyShop.put(orderId, products);
        System.out.println(orderHealtyShop);
        return false;
    }

}
