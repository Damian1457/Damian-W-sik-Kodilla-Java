package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    //List books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //List books borrowed by libraryUser
    List<Book> listBooksInHandsOff(LibraryUser libraryUser);

    //Try to rent a book for libraryUser
    //Return true when success
    //And returns false when book is unavailable to rent

    boolean rentABook(LibraryUser libraryUser, Book book);

    //Return all books borrowed by libraryUser to the library
    //Returns number of books returned back
    int returnBooks(LibraryUser libraryUser);

}
