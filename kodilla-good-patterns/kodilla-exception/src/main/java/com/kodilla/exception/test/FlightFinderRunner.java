package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.fingFlight(new Flight("Moscow", "Paris"));
        } catch (RouteNotFoundException e) {

        } finally {
            System.out.println("Start searching from the beginning");
        }
    }

}
