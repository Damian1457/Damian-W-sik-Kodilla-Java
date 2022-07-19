package com.kodilla.good.patterns.challenges.order;

public class ProductOrderService implements InformationOrderService {
    @Override
    public void emailInformation(User user) {
        System.out.println("Your delivery is go to you");
    }
}
