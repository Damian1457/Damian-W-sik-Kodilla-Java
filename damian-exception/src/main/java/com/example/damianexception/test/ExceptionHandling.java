package com.example.damianexception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try  {
            secondChallenge.probablyIWillThrowException(0.5, 1.2);
        } catch (Exception e) {
            System.out.println("Ok it's good exception!" + e);
        } finally {
            System.out.println("I will be here every day :)");
        }

    }





}
