package com.kodilla.stream.world;


import java.math.BigDecimal;

public class Country {

    private final String country;
    private final BigDecimal getPeopleQuantity;

    public Country(String country, BigDecimal getPeopleQuantity) {
        this.country = country;
        this.getPeopleQuantity = getPeopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return getPeopleQuantity;
    }

}