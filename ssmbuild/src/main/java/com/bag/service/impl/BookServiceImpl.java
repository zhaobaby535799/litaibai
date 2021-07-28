package com.bag.service.impl;

import com.bag.dao.BookMapper;
import com.bag.pojo.Books;
import com.bag.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: zhaoBaby
 * Date: 2021/7/23
 * Time: 20:13
 * 概要:
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Service
public class BookServiceImpl implements BookService {
//    Service调Dao层：组合Dao
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookId(int id) {
        return bookMapper.queryBookId(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
