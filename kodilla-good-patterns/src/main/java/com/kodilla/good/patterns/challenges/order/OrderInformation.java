package com.kodilla.good.patterns.challenges.order;

public class OrderInformation implements OrderInformationInformation {
    @Override
    public void inform(User user) {
        System.out.print("Your order has been placed!");
    }
}
