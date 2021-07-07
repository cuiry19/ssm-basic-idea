package com.cui.service;

import com.cui.dao.BookMapper;
import com.cui.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//业务层调Dao层
public class BookServiceImpl implements BookService{
    //组合Dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int upadateBook(Books book) {
        return bookMapper.upadateBook(book);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
