package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

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

    //添加一个用户
    public void insert(User user);
    //加入一个收藏
    public void addFavorite(@Param("id") String id,@Param("lid") String lid);
    //根据电话查询一个用户
    public User selectByPhone(String phone);
    //根据id查询一个用户
    public User selectById(String id);
}