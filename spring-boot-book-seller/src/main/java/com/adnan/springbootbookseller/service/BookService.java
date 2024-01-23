package com.adnan.springbootbookseller.service;

import com.adnan.springbootbookseller.models.Book;
import com.adnan.springbootbookseller.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Service
public class BookService implements IBookService {
    private IBookRepository bookRepository;
    @Override
    public Book saveBook(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }
    @Override
    public void deleteBook(Long Id){
        bookRepository.deleteById(Id);
    }
    @Override
    public List<Book> findAll(){
        return bookRepository.findAll();
    }


}
