package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderRepositoryRepository {

    boolean order(User user, LocalDate now);

}
