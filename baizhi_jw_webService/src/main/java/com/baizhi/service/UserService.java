package com.baizhi.service;

import com.baizhi.entity.User;
import com.baizhi.vo.Paging;
import com.baizhi.vo.UserLawer;
import com.baizhi.vo.UserOrder;
import com.baizhi.vo.UserRedpackage;

import java.util.List;

/**
 * Created by asus on 2017/6/14.
 */
public interface UserService {
    //查询所有的用户
    public Paging<User> queryAll(int page, int rows);
    //查询一个用户的所有订单
    public List<UserOrder> queryOrder(String id);
    //查询一个用户的所有红包
    public List<UserRedpackage> queryRedpackage(String id);
    //查询一个用户的所有收藏
    public List<UserLawer> queryLawer(String id);
}
