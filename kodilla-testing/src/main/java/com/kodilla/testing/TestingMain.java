package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

                String result = simpleUser.getUserName();

        if(result.equals("theForumUser")) {
            System.out.println("test Ok");
        }else {
            System.out.println("Error!");
        }

//Calculator

        Calculator simpleCalculator = new Calculator();
        int add = simpleCalculator.addAToB(4, 5);
        int sub = simpleCalculator.subtractAFromB(10, 5);

        //add test
        if(add == 9) {
            System.out.println("Test OK!");
        } else {
            System.out.println("BAd TEST!");
        }

        //sub test
        if(sub == 5) {
            System.out.println("Good!");
        } else {
            System.out.println("Bad!");
        }
    }
}
