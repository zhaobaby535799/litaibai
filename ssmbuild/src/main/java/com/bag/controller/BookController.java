package com.bag.controller;

import com.bag.pojo.Books;
import com.bag.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: zhaoBaby
 * Date: 2021/7/23
 * Time: 21:43
 * 概要:
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Controller
@RequestMapping("/book")
public class BookController {
//    controller调service层
    @Autowired
    @Qualifier("BookServiceImpl") //通过这个标示，表明了哪个实现类才是我们所需要的
    private BookService bookService;

//    查询全部的书籍，并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
//      调用业务层方法查询全部的书籍
        List<Books> allBook = bookService.queryAllBook();
        model.addAttribute("list",allBook);
        return "allBook";
    }

}
