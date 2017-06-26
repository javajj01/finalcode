package com.baizhi.service;

import com.baizhi.annotation.CacheAnnotation;
import com.baizhi.entity.User;
import com.baizhi.vo.*;

import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2017/6/14.
 */
public interface UserService {
    //查询所有的用户
    public Paging<User> queryAll(int page,int rows);
    //查询一个用户的所有订单
    public List<UserOrder> queryOrder(String id);
    //查询一个用户的所有红包
    public List<UserRedpackage> queryRedpackage(String id);
    //查询一个用户的所有收藏
    @CacheAnnotation
    public List<UserLawer> queryLawer(String id);

    //查询所有用户送的红包数
    public RedpackageCounts queryAllUserCount();
}
