package com.kodilla.good.patterns.challenges.order;

import java.util.List;

public class Order {
     private List<Product> theProducts;
     private User user;

    public Order(List<Product> theProducts, User user) {
        this.theProducts = theProducts;
        this.user = user;
    }

    public List<Product> getTheProducts() {
        return theProducts;
    }

    public User getUser() {
        return user;
    }



}
