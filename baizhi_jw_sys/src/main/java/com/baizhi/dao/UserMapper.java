package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserMapper {

    //根据用户id查询该用户的订单 包括评价
    public User selectOrder(String id);
    //查询所有用户
    public List<User> selectAll();
    //根据用户id查询该用户的收藏律师
    public User selectfavorite(String id);
    //查询该用户的心意
    public User selectRedPackage(String id);
    //查看一个用户送的红包次数
    public User selectUserCount(String id);



}