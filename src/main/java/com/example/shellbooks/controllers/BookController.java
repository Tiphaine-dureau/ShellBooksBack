package com.example.shellbooks.controllers;

import com.example.shellbooks.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        Book book = new Book();
        books.add(book);
        return books;
    }
}
