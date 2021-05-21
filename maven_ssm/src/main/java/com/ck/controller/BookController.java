package com.ck.controller;

import com.ck.entity.Book;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月14日 9:59
 */
@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("queryAll")
    public String queryAll(ModelMap map){
        System.out.println("我是老王");
        System.out.println("我不是老王！");
        System.out.println("zhongtt123");
        System.out.println("12345678678945");
        System.out.println("我是老王2.....");
        List<Book> books = bookService.queryAll();
        map.put("bookList", books);
        return "book";
    }
}
