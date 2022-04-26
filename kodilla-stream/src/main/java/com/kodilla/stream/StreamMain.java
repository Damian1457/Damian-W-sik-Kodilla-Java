package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String abc = "ABV";

        poemBeautifier.beautify("poem1", string -> string + "ABC");
        poemBeautifier.beautify("poem1", string -> "DEF" + string + "ABC");
        poemBeautifier.beautify("poem1", string -> string.toLowerCase());
        poemBeautifier.beautify("poem1", string -> string.toUpperCase() + "ABC");
        poemBeautifier.beautify("poem1", string -> string.substring(3));
        poemBeautifier.beautify("poem1", string -> string.replaceFirst("A", "Z"));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }

}
