package com.example.shellbooks.service;

import com.example.shellbooks.entity.Book;
import com.example.shellbooks.model.ViewBook;
import com.example.shellbooks.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<ViewBook> getBooks() {
        List<ViewBook> viewBooks = new ArrayList<>();
        List<Book> books = bookRepository.findAll();
        for (Book book : books) {
            ViewBook viewBook = new ViewBook();
            viewBook.setName(book.getName());
            viewBooks.add(viewBook);
        }
        return viewBooks;
    }
    public void createBook(ViewBook book) {
        Book bookEntity = new Book();
        bookEntity.setName(book.getName());
        bookRepository.save(bookEntity);
    }
}
