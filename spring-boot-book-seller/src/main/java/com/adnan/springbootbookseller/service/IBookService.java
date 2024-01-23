package com.adnan.springbootbookseller.service;

import com.adnan.springbootbookseller.models.Book;

import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long Id);

    List<Book> findAll();
}
