package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderService implements OrderServiceService {
    @Override
    public boolean createOrder(User user, LocalDate now) {
        return true;
    }
}
