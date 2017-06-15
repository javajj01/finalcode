package com.baizhi.service;

import com.baizhi.entity.User;
import com.taobao.api.ApiException;

/**
 * Created by asus on 2017/6/15.
 */
public interface UserService {
    //添加
    public User add(User user);
    //发送手机验证码
    public String phonecode(String phone) throws Exception;
    //根据用户id查询该用户的收藏的律师
    public User selectFavorite(String id);
    //添加一个收藏
    public void addfavorite(String id,String lid);
    //查询一个用户
    public User queryByid(String id);
}
