package com.example.shellbooks.repository;

import com.example.shellbooks.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
