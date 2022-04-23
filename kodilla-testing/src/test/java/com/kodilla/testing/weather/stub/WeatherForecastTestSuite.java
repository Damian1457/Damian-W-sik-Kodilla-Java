package com.kodilla.testing.weather.stub;



import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WeatherForecastTestSuite {
    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }
}