package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDate;


public class OrderRepository implements OrderRepositoryRepository {
    @Override
    public boolean order(User user, LocalDate now) {
        return true;
    }
}
