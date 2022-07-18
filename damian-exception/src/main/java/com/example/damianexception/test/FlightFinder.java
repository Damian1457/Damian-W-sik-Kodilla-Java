package com.example.damianexception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> theAirports = new HashMap<>();
        theAirports.put("Warsaw", true);
        theAirports.put("Vien", true);
        theAirports.put("Milan", false);
        theAirports.put("Saloniki", true);

        if (!theAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        if (!theAirports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        return theAirports.get(flight.getDepartureAirport()) && theAirports.get(flight.getArrivalAirport());

    }

}
