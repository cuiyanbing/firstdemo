package com.cui.firstdemo.service;

import com.cui.firstdemo.domain.Book;
import com.cui.firstdemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cui
 * @since 创建时间：2019/6/24 15:07
 */
@Service
public class BookService {
//    @Autowired
//    private BookDao bookDao;
//
//    public int addBook(Book book) {
//        return bookDao.addBook(book);
//    }
//    public int updateBook(Book book) {
//        return bookDao.updateBook(book);
//    }
//
//    public int deleteBookById(Integer id) {
//        return bookDao.deleteBookById(id);
//    }
//
//    public Book getBookById(Integer id) {
//        return bookDao.getBookById(id);
//    }
//
//    public List<Book> getAllBooks() {
//        return bookDao.getAllBooks();
//    }
    @Autowired
    private BookMapper bookMapper;
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
    public int updateBook(Book book) {
        return bookMapper.updateBookById(book);
    }

    public int deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
