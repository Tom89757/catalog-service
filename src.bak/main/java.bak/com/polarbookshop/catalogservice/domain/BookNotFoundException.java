package com.polarbookshop.catalogservice.domain;

/**
 * @author Tom89757
 */
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
