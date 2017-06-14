package com.baizhi.dao;

import com.baizhi.entity.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(Order record);



    Order selectByPrimaryKey(String id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}