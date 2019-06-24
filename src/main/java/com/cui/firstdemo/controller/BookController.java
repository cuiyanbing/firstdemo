package com.cui.firstdemo.controller;

import com.cui.firstdemo.domain.Book;
import com.cui.firstdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author cui
 * @since 创建时间：2019/6/17 18:52
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private Book book;

    @RequestMapping("/addbook")
    public void addBook() {
        bookService.addBook(book);
    }
    @RequestMapping("/updateBookById")
    public void updateBookById() {
        bookService.updateBook(book);
    }
    @RequestMapping("/deleteBookById")
    public void deleteBookById(Integer id) {
        bookService.deleteBookById(id);
    }

    @RequestMapping("/getBookById")
    public Book getBookById(Integer id) {
        return bookService.getBookById(id);
    }

    @RequestMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
