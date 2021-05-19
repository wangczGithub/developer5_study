package com.ck.service.imp;

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
 * @Date 2021年05月18日 15:38
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
