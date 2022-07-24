package com.kodilla.good.patterns.challenges.Food2Door;


import com.kodilla.good.patterns.challenges.Food2Door.orders.OrderProcessor;
import com.kodilla.good.patterns.challenges.Food2Door.orders.OrderProcessorDto;
import com.kodilla.good.patterns.challenges.Food2Door.orders.OrderRequest;
import com.kodilla.good.patterns.challenges.Food2Door.products.ProductsLists;

public class Application {

    public static void main(String[] args) {

        ProductsLists productsLists = new ProductsLists();

        OrderRequest orderRequest1 = new OrderRequest(1, 2, true);
        OrderRequest orderRequest2 = new OrderRequest(1, 2, true);
        OrderRequest orderRequest3 = new OrderRequest(1, 2, true);
        OrderRequest orderRequest4 = new OrderRequest(1, 2, true);
        OrderRequest orderRequest5 = new OrderRequest(1, 2, true);
        OrderRequest orderRequest6 = new OrderRequest(1, 2, true);
        OrderRequest orderRequest7 = new OrderRequest(1, 2, true);

        OrderProcessor orderProcessor = new OrderProcessor(productsLists);

        OrderProcessorDto orderProcessorDto1 = orderProcessor.prossOrder(orderRequest1);
        OrderProcessorDto orderProcessorDto2 = orderProcessor.prossOrder(orderRequest2);
        OrderProcessorDto orderProcessorDto3 = orderProcessor.prossOrder(orderRequest3);
        OrderProcessorDto orderProcessorDto4 = orderProcessor.prossOrder(orderRequest4);
        OrderProcessorDto orderProcessorDto5 = orderProcessor.prossOrder(orderRequest5);
        OrderProcessorDto orderProcessorDto6 = orderProcessor.prossOrder(orderRequest6);
        OrderProcessorDto orderProcessorDto7 = orderProcessor.prossOrder(orderRequest7);

        orderProcessorDto1.showOrderStatus();
        orderProcessorDto2.showOrderStatus();
        orderProcessorDto3.showOrderStatus();
        orderProcessorDto4.showOrderStatus();
        orderProcessorDto5.showOrderStatus();
        orderProcessorDto6.showOrderStatus();
        orderProcessorDto7.showOrderStatus();

    }

}
