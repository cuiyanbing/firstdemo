package com.cui.firstdemo.controller;

import com.cui.firstdemo.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author cui
 * @since 创建时间：2019/6/17 18:52
 */
@RestController
public class BookController {
    @GetMapping("/book")
    public Book books() {
        Book book1 = new Book();
        book1.setAuthor("罗贯中");
        book1.setName("三国演义");
        book1.setPrice(30f);
        book1.setPublicationDate(new Date());
        return book1;
    }

    @PostMapping("/")
    @CrossOrigin(value = "http://localhost:9998", maxAge = 18000, allowedHeaders = "*")
    public String addBook(String name) {
        return "receive:" + name;
    }
    @DeleteMapping("/{id}")
    @CrossOrigin(value = "http://localhost:9998", maxAge = 18000, allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
