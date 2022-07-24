package com.kodilla.good.patterns.challenges.Food2Door.orders;

import com.kodilla.good.patterns.challenges.Food2Door.producers.Producers;
import com.kodilla.good.patterns.challenges.Food2Door.products.ProductsLists;

public class OrderProcessor {

    private final ProductsLists productsLists;

    public OrderProcessor(ProductsLists productsLists) {
        this.productsLists = productsLists;
    }

    public OrderProcessorDto prossOrder(OrderRequest orderRequest) {
        Producers producers = productsLists.getDelivery(orderRequest.getProductId());

        boolean ifOrdered = producers.process(productsLists.getProduct(orderRequest.getProductId()), orderRequest.getQuantity());
        return new OrderProcessorDto(orderRequest, ifOrdered);
    }
}
