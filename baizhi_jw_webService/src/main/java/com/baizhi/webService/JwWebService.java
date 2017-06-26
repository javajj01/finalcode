package com.baizhi.webService;

import com.baizhi.entity.Comment;
import com.baizhi.entity.Order;
import com.baizhi.entity.Redpackage;
import com.baizhi.entity.User;
import javafx.beans.binding.ObjectExpression;

import javax.jws.WebService;
import java.util.HashMap;

/**
 * Created by asus on 2017/6/15.
 */
@WebService
public interface JwWebService {
    //注册接口
    public HashMap<String,Object> registOrLogin(String phone,String code);
    //验证码接口
    public HashMap<String,Object> phonecode(String phone) throws Exception;
    //查看一个用户收藏的律师接口
    public HashMap<String,Object> showUserFavorite(String id);
    //根据用户id查询一个用户的接口
    public HashMap<String, Object> showUserById(String id);
    //添加一个收藏接口
    public HashMap<String,Object> addUserFavorite(String id,String lid);
    //展示所有的律师
    public HashMap<String,Object> showAllLawer();
    //展示一个律师的详细信息
    public HashMap<String,Object> showOneLawerDetail(String id);
    //展示所有的律师分类
    public HashMap<String,Object> showLawerType();
    //根据律师分类展示所有的律师
    public HashMap<String,Object> showLawerByLawerType(String id);
    //展示所有的一级案例分类
    public HashMap<String,Object> showAllOneDealType();
    //根据一级分类id展示其详细
    public HashMap<String,Object> showOneDealTypeDeatil(String id);
    //根据二级分类id展示其案例
    public HashMap<String,Object> showDealByTwoDealId(String id);
    //根据一个id查询案例
    public HashMap<String,Object> showOneDeal(String id);
    //添加一个红包
    public HashMap<String,Object> addRedpackage(Redpackage redpackage);
    //添加一个评价
    public HashMap<String,Object> addComment(Comment comment);
    //调用订单接口
    public HashMap<String ,Object> addOrder(Order order);
    //订单的更新接口
    public HashMap<String,Object> updateOrderStatus(Integer status);
}
