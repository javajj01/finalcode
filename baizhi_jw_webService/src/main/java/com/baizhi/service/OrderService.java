package com.baizhi.service;

import com.baizhi.entity.Order;
import com.baizhi.vo.OrderDetail;
import com.baizhi.vo.Paging;

import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
public interface OrderService {
    //展示所有的订单
    public Paging<OrderDetail> queryAll(int page, int rows);
}
