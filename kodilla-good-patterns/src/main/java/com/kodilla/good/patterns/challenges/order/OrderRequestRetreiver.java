package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetreiver {

    public OrderRequest retreiver(){

        User user = new User("Damian Wąsik", "damianwasik.coach@gmail.com", "ul. Powstańców 21, 05-660 Warka");
        LocalDateTime.now();
        return new OrderRequest(user, LocalDate.now());

    }

}
