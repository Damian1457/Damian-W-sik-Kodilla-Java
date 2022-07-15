package com.kodilla.stream.Arrays;

import java.util.stream.IntStream;

public interface ArrayOperations {

     static double getAverage(int[] numbers) {
          IntStream.range(0, numbers.length)
                  .map(n -> numbers[n])
                  .forEach(System.out::println);

          Double result = IntStream.range(0, numbers.length)
                  .map(j -> numbers[j])
                  .average()
                  .orElse(0);

          return result;
     }

}
