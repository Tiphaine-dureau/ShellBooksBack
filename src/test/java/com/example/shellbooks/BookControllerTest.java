package com.example.shellbooks;

import com.example.shellbooks.entity.Book;
import com.example.shellbooks.repository.BookRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookControllerTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @Order(1)
    void testCreateBook(){
        Book book = new Book();
        book.setId(6L);
        book.setName("Narnia");
        bookRepository.save(book);
        assertNotNull(bookRepository.findById(6L).get());
    }

    @Test
    @Order(2)
    void testGetAllBooks(){
        List bookList = bookRepository.findAll();
        assertThat(bookList).size().isPositive();
    }

    @Test
    @Order(3)
    void testGetBookById(){
        Book book = bookRepository.findById(6L).get();
        assertEquals("Narnia", book.getName());
    }
}
