package com.multiDB.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiDB.book.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
