package com.adnan.springbootbookseller.repository;

import com.adnan.springbootbookseller.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IBookRepository extends JpaRepository<Book,Long> {

}
