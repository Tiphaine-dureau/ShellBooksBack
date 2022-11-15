package com.example.shellbooks.controllers;

import com.example.shellbooks.model.ViewBook;
import com.example.shellbooks.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<ViewBook> getBooks() {
        return bookService.getBooks();
    }
}
