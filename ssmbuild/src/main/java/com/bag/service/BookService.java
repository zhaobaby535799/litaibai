package com.bag.service;

import com.bag.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: zhaoBaby
 * Date: 2021/7/23
 * Time: 20:12
 * 概要: 业务层
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public interface BookService {
    int addBook(Books books);
    int deleteBook(@Param("bookId") int id);
    int updateBook(Books books);
    Books queryBookId(int id);
    List<Books> queryAllBook();
}
