package com.jiangchao.ssmallone.dao;

import com.jiangchao.ssmallone.bean.newss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper1 {

    @Select("select * from news")
    public List<newss> getnews();
}
