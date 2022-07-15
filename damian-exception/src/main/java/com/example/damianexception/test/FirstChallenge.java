package com.example.damianexception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
        } catch(ArithmeticException e) {
            System.out.println("It's a bug, please return" + e);
        } finally {
            System.out.println("Finall, maybe is better!");
        }




    }



}
