package com.baizhi.dao;

import com.baizhi.entity.Dealtype;

import java.util.List;

public interface DealtypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Dealtype record);



    Dealtype selectByPrimaryKey(String id);

    //查询所有的案例分类
    public List<Dealtype> selectAll();

    int updateByPrimaryKey(Dealtype record);
    //根据一级分类标签展示二级分类
    public Dealtype selectTwoTag(String id);
    //删除便签下所有
    public void deleteparentid(String id);
    //根据一级分类标签id展示所有的二级分类以及所有的二级分类案例
    public Dealtype selectDetail(String id);
    //根据二级分类id查询所有的案例
    public Dealtype selectTwo(String id);
}