package com.cui.firstdemo.mapper;

import com.cui.firstdemo.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author cui
 * @since 创建时间：2019/6/24 19:31
 */
@Mapper
public interface BookMapper {
    int addBook(Book book);

    int updateBookById(Book book);

    int deleteBookById(Integer id);

    Book getBookById(Integer id);

    List<Book> getAllBooks();
}
