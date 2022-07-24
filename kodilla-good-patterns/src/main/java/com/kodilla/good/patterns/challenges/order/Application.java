package com.kodilla.good.patterns.challenges.order;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetreiver orderRequestRetreiver = new OrderRequestRetreiver();
        OrderRequest orderRequest = orderRequestRetreiver.retreiver();

        ProductOrderService productOrderService = new ProductOrderService(new OrderService(), new OrderInformation(), new OrderRepository());
        productOrderService.process(orderRequest);
    }

}
