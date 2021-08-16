package com.zeneto.bookstoremanager.books.repository;

import com.zeneto.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
