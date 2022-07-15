package com.example.damianexception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Boolean flightFinder(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Dublin", true);
        flightMap.put("Paris", false);
        flightMap.put("Rome", true);

       if (!flightMap.containsKey(flight.getArrivalAirport()))
           return flightMap.get(flight.getArrivalAirport());
        else
            throw new RouteNotFoundException();


    }

}
