package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> newList = new LinkedList<>();
        for(Integer exterminateNew : numbers) {
            if(exterminateNew % 2 == 0) {
                newList.add(exterminateNew);
            }

        }
        return newList;
    }


}
