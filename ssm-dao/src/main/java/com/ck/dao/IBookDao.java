package com.ck.dao;

import com.ck.entity.Book;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBookDao {

    // 查询所有图书
    @Select("select * from bookmanage")
    @ResultMap("bookMapper")
    public List<Book> queryAll();
}
