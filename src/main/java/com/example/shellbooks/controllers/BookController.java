package com.example.shellbooks.controllers;

import com.example.shellbooks.model.ViewBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<ViewBook> getBooks() {
        List<ViewBook> viewBooks = new ArrayList<>();
        ViewBook viewBook = new ViewBook("Harry Potter");
        ViewBook viewBook2 = new ViewBook("Le seigneur des anneaux");

        viewBooks.add(viewBook);
        viewBooks.add(viewBook2);
        return viewBooks;
    }
}
