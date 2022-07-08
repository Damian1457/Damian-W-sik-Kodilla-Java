package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> theContinentList = new ArrayList<>();

    public List<Continent> getTheContinentList() {
        return theContinentList;
    }

    public void addContinents(Continent continent) {
        theContinentList.add(continent);
    }

    public BigDecimal getWorldPeopleQuantity() {
        return theContinentList.stream()
                .flatMap(continent -> continent.getTheCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }


}