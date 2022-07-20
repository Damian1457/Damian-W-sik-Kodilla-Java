package com.kodilla.good.patterns.challenges.order;

public class Service implements ServiceService {

    @Override
    public boolean service(Product product) {
        System.out.println(product);
        return true;
    }
}
