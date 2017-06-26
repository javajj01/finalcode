package com.baizhi.service;

import com.baizhi.entity.Order;

/**
 * Created by asus on 2017/6/15.
 */
public interface OrderService {
    //添加一个订单
    public void addOrder(Order order);
    //修改一个订单
    public void updateOrderStatus(Order order);
}
