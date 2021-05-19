package com.ck.controller;

import com.ck.entity.Book;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月18日 16:01
 */
@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("queryAll")
    @ResponseBody
    public List<Book> queryAll(){
        return bookService.queryAll();
    }

}
