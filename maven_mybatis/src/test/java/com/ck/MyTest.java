package com.ck;

import com.ck.dao.ISusheDaoImpl;
import com.ck.entity.Sushe;
import org.junit.Test;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月13日 10:50
 */
public class MyTest {

    @Test
    public void test1(){
        ISusheDaoImpl dao = new ISusheDaoImpl();
        List<Sushe> list = dao.queryAll();
        System.out.println(list);
    }

}
