package com.bag.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Author: zhaoBaby
 * Date: 2021/7/23
 * Time: 19:49
 * 概要: 实体类
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
