package com.wickedwitchwarsaw.scholarshipbooklistingapp;

/**
 * Created by ZuZ on 08/07/2017.
 */
public class Book {

    private String bookTitle;
    private String bookAuthor;

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
