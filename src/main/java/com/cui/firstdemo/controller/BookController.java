package com.cui.firstdemo.controller;

import com.cui.firstdemo.domain.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author cui
 * @since 创建时间：2019/6/17 18:52
 */
@RestController
public class BookController {
    @GetMapping("/books")
    public Book books() {
        Book book1 = new Book();
        book1.setAuthor("罗贯中");
        book1.setName("三国演义");
        book1.setPrice(30f);
        book1.setPublicationDate(new Date());
        return book1;
    }
}
