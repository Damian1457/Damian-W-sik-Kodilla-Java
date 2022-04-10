package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @DisplayName("Test1: " + "To see if the number of posts is 1 after adding a new post.")

    @Test
    void testAddPost() {

        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");

        //Then
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }

    @DisplayName("Test2: " + "Checking if the number of comments is equal to 1 after adding a new comment.")

    @Test
    void testAddComment(){

        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

        //When
        forumUser.addComment(thePost, "mrsmith", "Than you for all good words!");

        //Then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());

    }

    @DisplayName("Test3: " + "Checking if the post downloaded from the ForumUser class is the same as the post that was inserted" +
                 "into the clas.")

    @Test
    void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Helo everyone, " + "thois is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assertions.assertEquals(theComment, retrievedComment);
    }

    @DisplayName("Test5: " + "Checking whether an attempt to delete a non-exist post will result in a false result.")

    @Test
    void testRemovePostNotExisting() {

        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertFalse(result);
    }

    @DisplayName("Test6: " + "Checks if an attempt to delete a nonexistent comment returns false.")

    @Test
    void testRemoveCommentNotExisting() {

        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assertions.assertFalse(result);
    }

    @DisplayName("Test7: " + "Verifying that the selected post was successfully removed from the class.")

    @Test
    void testRemovePost() {

        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());

    }

    @DisplayName("Verifying that the selected comment has been removed from the class.")

    @Test
    void testRemoveComment() {

        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "Jonh Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());

    }

}
