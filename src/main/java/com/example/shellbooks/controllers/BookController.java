package com.example.shellbooks.controllers;

import com.example.shellbooks.model.ViewBook;
import com.example.shellbooks.service.BookService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/books")
    public void createBook(@RequestBody ViewBook book){
        bookService.createBook(book);
    }
}
