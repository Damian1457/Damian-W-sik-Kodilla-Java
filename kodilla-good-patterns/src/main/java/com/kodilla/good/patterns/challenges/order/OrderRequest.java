package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDate now;

    public OrderRequest(User user, LocalDate now) {
        this.user = user;
        this.now = now;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getNow() {
        return now;
    }
}
