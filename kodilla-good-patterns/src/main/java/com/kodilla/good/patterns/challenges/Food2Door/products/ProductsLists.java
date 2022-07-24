package com.kodilla.good.patterns.challenges.Food2Door.products;

import com.kodilla.good.patterns.challenges.Food2Door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.Food2Door.producers.HealthyShop;
import com.kodilla.good.patterns.challenges.Food2Door.producers.Producers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductsLists {

    private final List<Products> productsList = new ArrayList<>();
    private final Map<Integer, Producers> producersMap = new HashMap<>();

    public ProductsLists() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        productsList.add(new FoodProducts("Milk", 10.0, 12));
        productsList.add(new FoodProducts("Milk", 10.0, 12));
        productsList.add(new FoodProducts("Milk", 10.0, 12));
        productsList.add(new FoodProducts("Milk", 10.0, 12));
        productsList.add(new FoodProducts("Milk", 10.0, 12));
        productsList.add(new FoodProducts("Milk", 10.0, 12));

        producersMap.put(productsList.get(0).productId(), extraFoodShop);
        producersMap.put(productsList.get(1).productId(), extraFoodShop);
        producersMap.put(productsList.get(2).productId(), extraFoodShop);
        producersMap.put(productsList.get(3).productId(), glutenFreeShop);
        producersMap.put(productsList.get(4).productId(), extraFoodShop);
        producersMap.put(productsList.get(5).productId(), healthyShop);
    }

    public Producers getDelivery(int productId) {
        return producersMap.get(productId);
    }

    public Products getProduct(int productTd) {
        return productsList.stream()
                .filter(products -> products.productId() == productTd)
                .findAny().orElseThrow(IllegalAccessError::new);
    }

}
