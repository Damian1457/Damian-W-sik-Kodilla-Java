package com.kodilla.good.patterns.challenges.order;

public class OrderDto {

    private User user;
    private boolean isRented;

    public OrderDto(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
