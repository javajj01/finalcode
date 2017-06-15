package com.baizhi.dao;

import com.baizhi.entity.Menu;

import java.util.List;

public interface MenuMapper {

    //查询所有的菜单
    public List<Menu> selectAll();
}