package com.example.damianexception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Prague", "Vien");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.flightFinder(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight could not be found");
        }

    }



}
