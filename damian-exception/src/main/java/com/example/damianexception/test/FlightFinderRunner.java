package com.example.damianexception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Warsaw", "Stokholm"));
        } catch (RouteNotFoundException e) {
           System.out.println("sss" + e);
        }


    }



}
