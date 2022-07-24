package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderServiceService {

    boolean createOrder(User user, LocalDate now);

}
