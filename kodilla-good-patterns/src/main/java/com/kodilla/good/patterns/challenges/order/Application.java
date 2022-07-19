package com.kodilla.good.patterns.challenges.order;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
    User user = new User("Damian Wąsik", "damianwasik", "Powst");

    List<Product> theProductList = new ArrayList<>();
    theProductList.add(new Product("Milk", 10.0, 2));
    theProductList.add(new Product("Milk", 10.0, 2));
    theProductList.add(new Product("Milk", 10.0, 2));
    theProductList.add(new Product("Milk", 10.0, 2));
    theProductList.add(new Product("Milk", 10.0, 2));
    theProductList.add(new Product("Milk", 10.0, 2));

    Service service = new Service();

    PriceCalculate priceCalculate = new PriceCalculate();

    double price = 0;

    for (Product product : theProductList) {
        if (service.buyProduct(product)) {
            price += priceCalculate.priceCalculate(product);
        }
    }

    System.out.println("Price: " + price);
    ProductOrderService productOrderService = new ProductOrderService();
    productOrderService.emailInformation(user);

    }

}
