package com.example.damianexception.io;

import com.example.damianexception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testprobablyIWillThrowException {

    @Test
    void probablyWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 3))
        );
    }

}
