package com.bag.dao;

import com.bag.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * Author: zhaoBaby
 * Date: 2021/7/23
 * Time: 19:53
 * 概要: Dao层
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public interface BookMapper {
//    增加书籍
    int addBook(Books books);
//    删除书籍
    int deleteBook(@Param("bookId") int id);
//    修改书籍
    int updateBook(Books books);
//    查询一本书籍
    Books queryBookId(int id);
//    查询全部书籍
    List<Books> queryAllBook();
}
