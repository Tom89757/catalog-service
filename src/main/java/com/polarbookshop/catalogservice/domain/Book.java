package com.polarbookshop.catalogservice.domain;

/**
 * @author Tom89757
 */
public record Book(
   String isbn,
   String title,
   String author,
   Double price
) {}
