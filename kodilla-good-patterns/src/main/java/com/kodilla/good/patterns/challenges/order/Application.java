package com.kodilla.good.patterns.challenges.order;


public class Application {

    public static void main(String[] args) {

    ProductOrderService productOrderService = new ProductOrderService(new Email(), new PriceCalculate(), new Service());
    productOrderService.process();


    }

}
