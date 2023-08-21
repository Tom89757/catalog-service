package com.polarbookshop.catalogservice.domain;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Tom89757
 */
public interface BookRepository extends CrudRepository<Book, Long> {
//    Iterable<Book> findAll();
//    Optional<Book> findByIsbn(String isbn);
//    boolean existsByIsbn(String isbn);
//    Book save(Book book);
//    void deleteByIsbn(String isbn);
    Optional<Book> findByIsbn(String isbn);
    boolean existsByIsbn(String isbn);

    @Modifying
    @Query("delete from Book where isbn = :isbn")
    void deleteByIsbn(String isbn);
}
