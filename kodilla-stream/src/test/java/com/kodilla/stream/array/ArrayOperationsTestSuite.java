package com.kodilla.stream.array;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int [] numbers = new int[] {};

        //When
        double average = ArrayOperations.testGetAverage(numbers);
        System.out.println(average);

        //Then
        assertEquals(0, average,0.1);
    }

}
