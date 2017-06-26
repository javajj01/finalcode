package com.baizhi.dao;

import com.baizhi.entity.Admin;

public interface AdminMapper {

    int deleteByPrimaryKey(String id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    //根据名字查询该管理员
    public  Admin selectByName(String name);
    //根据管理员名字查询该管理员的所有角色和所有权限
    public Admin selectByNameDetail(String name);
}