package com.kodilla.stream;


import com.kodilla.stream.repeat.forum.Forum;
import com.kodilla.stream.repeat.forum.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

       /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();

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

        //The previous



        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())

                .forEach(System.out::println); */





        /* BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks); */





        /*Forum forum = new Forum();


        Map<String, ForumUser> resultMap = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() >= 2000)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getPeselId, forumUser -> forumUser ));

        System.out.println(resultMap.size());
        resultMap.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
*/


        /* PeopleNew.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

      /*  BookDirectoryNew bookDirectoryNew = new BookDirectoryNew();

       List<BookNew> theListOfBooks = bookDirectoryNew.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

       System.out.println(theListOfBooks);

       theListOfBooks.stream()
               .forEach(System.out::println);
*/

      /*  BookDirectoryNew bookDirectoryNew = new BookDirectoryNew();
        Map<String,BookNew> theMapOfBooks = bookDirectoryNew.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(BookNew::getSignature, book -> book));

        System.out.println(theMapOfBooks);
        theMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks =
                theBookDirectory.getList().stream() // [1]
                        .filter(book -> book.getYearOfPublication() > 2005)
                        .map(Book::toString)
                        .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        Forum forum = new Forum();
       Map<Integer, ForumUser> theMap = forum.getUserList().stream()
                .filter(f -> f.getSex() == 'M')
                .filter(f -> Period.between(f.getBirthDate(), LocalDate.now()).getYears() > 20)
                .filter(f -> f.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));


               theMap.entrySet().stream()
                                .map(e -> e.getKey() +  ": " + e.getValue())
                                        .forEach(System.out::println);




    }

}
