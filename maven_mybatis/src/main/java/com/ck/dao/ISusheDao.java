package com.ck.dao;

import com.ck.entity.Sushe;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISusheDao {

    // 查询所有
    @Select("select * from goods")
    @ResultMap("susheMapper")
    public List<Sushe> queryAll();
}
