package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SandStorageTestSuite {

    @Test
    void  testGetSandBeansQuantity() {
        //Given
        List<SandStorage> theContinents = new ArrayList<>();
        theContinents.add(new Africa());
        theContinents.add(new Europe());
        theContinents.add(new Asia());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continents : theContinents) {
            totalSand = totalSand.add(continents.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);

    }

    @Test
    void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> theContinents = new ArrayList<>();
        theContinents.add(new Africa());
        theContinents.add(new Europe());
        theContinents.add(new Asia());

        //When
        BigDecimal totalSands = theContinents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, curent) -> sum = sum.add(curent));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(totalSands, expectedSand);
    }

}
