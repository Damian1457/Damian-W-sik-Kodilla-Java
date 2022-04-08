package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestsSuite {

    @BeforeEach
    public void befor() {
        System.out.println("Test case: end");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite: end");
    }

    @DisplayName("When created simple user name, " + "then getUsername should return correct name")

    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing" + result);

        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @Test
    void testCaseUserName() {

        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        //When
        String result = simpleUser.getUserName();

        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

}
