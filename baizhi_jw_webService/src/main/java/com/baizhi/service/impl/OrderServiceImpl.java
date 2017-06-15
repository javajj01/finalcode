package com.baizhi.service.impl;

import com.baizhi.dao.OrderMapper;
import com.baizhi.entity.Order;
import com.baizhi.service.OrderService;
import com.baizhi.vo.OrderDetail;
import com.baizhi.vo.Paging;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Paging<OrderDetail> queryAll(int page, int rows) {
        Page<Order> page1 = PageHelper.startPage(page, rows);
        orderMapper.selectAll();
        Paging<OrderDetail> paging = new Paging<OrderDetail>();
        ArrayList<OrderDetail> li = new ArrayList<OrderDetail>();
        for (Order order : page1.getResult()) {
            OrderDetail od= new OrderDetail();
            od.setId(order.getId());
            od.setContent(order.getContent());
            od.setStatus(order.getStatus());
            od.setType(order.getType());
            od.setUserid(order.getUser().getId());
            od.setUsername(order.getUser().getName());
            od.setLid(order.getLawer().getId());
            od.setLawername(order.getLawer().getName());
            li.add(od);
        }
        paging.setTotal((int) page1.getTotal());
        paging.setRows(li);
        return paging;
    }


}
