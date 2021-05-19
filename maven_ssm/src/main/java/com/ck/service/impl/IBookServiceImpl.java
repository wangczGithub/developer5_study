package com.ck.service.impl;

import com.ck.dao.IBookDao;
import com.ck.entity.Book;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月14日 9:59
 */
@Service
public class IBookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> queryAll() {
        return bookDao.queryAll();
    }
}
