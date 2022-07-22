package com.kodilla.good.patterns.challenges.order;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderService {

    private InformationOrderService informationOrderService;
    private PriceCalculatepriceCalculate priceCalculatepriceCalculate;
    private ServiceService serviceService;

    public ProductOrderService(InformationOrderService informationOrderService, PriceCalculatepriceCalculate priceCalculatepriceCalculate, ServiceService serviceService) {
        this.informationOrderService = informationOrderService;
        this.priceCalculatepriceCalculate = priceCalculatepriceCalculate;
        this.serviceService = serviceService;
    }

    public void process() {
        Order order = new Order(new ArrayList<>(), new User("Damian Wąsik", "Damian", "Pow"));
        List<Product> theProductList = order.getTheProducts();
        theProductList.add(new Product("Milk", 10.0, 2));
        theProductList.add(new Product("Milk", 10.0, 2));
        theProductList.add(new Product("Milk", 10.0, 2));
        theProductList.add(new Product("Milk", 10.0, 2));
        theProductList.add(new Product("Milk", 10.0, 2));




        double price = 0;

        for (Product product : theProductList) {
            if (serviceService.service(product)) {
                price += priceCalculatepriceCalculate.price(product);
            }
        }

        System.out.println("Price: " + price);
        informationOrderService.emailInformation(new User("Damian", "Wąsik", "Pows"));


    }

}
