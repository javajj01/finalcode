package com.baizhi.dao;

import com.baizhi.entity.Lawertype;

import java.util.List;

public interface LawertypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lawertype record);


    List<Lawertype> selectAll();

    Lawertype selectByPrimaryKey(String id);

    //删除律师关系表
    public void delete(String id);
    //根据分类id查询分类下的所有律师
    public Lawertype selectOneById(String id);

    int updateByPrimaryKey(Lawertype record);
}