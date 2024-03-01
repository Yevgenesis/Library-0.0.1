package com.example.Library001.sevice;

import com.example.Library001.entity.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    Book borrowBook(int bookId, int studentId);

    Book returnBook(int bookId);

    List<Book> getBooksList();

    Book findBookById(int bookId);
}
