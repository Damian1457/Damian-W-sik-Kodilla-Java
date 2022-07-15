package com.kodilla.stream.Arrays;


import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void  testGetAverage() {
        //Given
        int [] numbers = new int[]{};

        //When
        double average = ArrayOperations.getAverage(numbers);
        System.out.println(average);

        //Then
        assertEquals(0.0, average);


    }

}
