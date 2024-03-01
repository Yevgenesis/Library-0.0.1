package com.example.Library001.sevice.impl;

import com.example.Library001.entity.Book;
import com.example.Library001.sevice.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

//    @Autowired
    private BookRepository bookRepository;
//    @Autowired
    private StudentRepository studentRepository;
    private StudentBookRepository studentBookRepository;


    @Override
    public Book save(Book book) {

        return this.bookRepository.save(book);
    }

    @Override
    public Book borrowBook(int bookId, int studentId) {
        Book book = findBookById(bookId);
        Student student = studentRepository.findStudentById(studentId);
        if (book != null && book.isAvailable() && student != null){
            book.setAvailable(false);
            studentBookRepository.save(bookId,studentId);
            return save(book);
        }
        return null;
    }

    @Override
    public Book returnBook(int bookId) {
        Book book = findBookById(bookId);
        if(book != null && !book.isAvailable()){
            book.setAvailable(true);
            studentBookRepository.update(bookId);
            return save(book);
        }

        return null;
    }

    @Override
    public List<Book> getBooksList() {
        return bookRepository.getBooksList();
    }

    @Override
    public Book findBookById(int bookId) {
        return bookRepository.findBookById(bookId);
    }
}
