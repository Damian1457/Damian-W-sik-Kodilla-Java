package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> theCountryList = new ArrayList<>();
    private final String continents;

    public Continent(String continents) {
        this.continents = continents;
    }

    public void addCountry(Country country) {
        theCountryList.add(country);
    }

    public List<Country> getTheCountryList() {
        return theCountryList;
    }
}
