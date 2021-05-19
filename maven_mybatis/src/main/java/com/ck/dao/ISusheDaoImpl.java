package com.ck.dao;

import com.ck.entity.Sushe;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月13日 10:11
 */
public class ISusheDaoImpl {

    // 查询所有
    public List<Sushe> queryAll(){
        SqlSession session = MybatisUtil.openSession(false);
        ISusheDao susheDao = session.getMapper(ISusheDao.class);
        return susheDao.queryAll();
    }

}
