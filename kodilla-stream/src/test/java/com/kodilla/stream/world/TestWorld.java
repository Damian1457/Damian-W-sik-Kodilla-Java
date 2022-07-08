package com.kodilla.stream.world;



import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

public class TestWorld {

    @Test
    public void getPeopleQuantityOfWorld () {
        //Given
        World world = new World();
        Continent europa = new Continent("Europa");
        europa.addCountry(new Country("England", new BigDecimal("12345678")));
        europa.addCountry(new Country("Poland", new BigDecimal("12345678")));
        europa.addCountry(new Country("Italy", new BigDecimal("12345678")));
        europa.addCountry(new Country("Croatia", new BigDecimal("12345678")));
        europa.addCountry(new Country("Spain", new BigDecimal("12345678")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1000000")));
        asia.addCountry(new Country("Vietnam", new BigDecimal("1000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("1000000")));
        asia.addCountry(new Country("Thailand", new BigDecimal("1000000")));
        asia.addCountry(new Country("India", new BigDecimal("1000000")));
        world.addContinents(asia);
        world.addContinents(europa);

        //When
        BigDecimal people = world.getWorldPeopleQuantity();

        //Then
        assertEquals(people, new BigDecimal("66728390"));
    }

}
