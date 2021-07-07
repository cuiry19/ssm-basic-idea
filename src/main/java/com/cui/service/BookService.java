package com.cui.service;

import com.cui.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增
    int addBook(Books books);
    //删
    int deleteBookById(int id);
    //修改一本书
    int upadateBook(Books book);
    //根据id查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBook();
}
