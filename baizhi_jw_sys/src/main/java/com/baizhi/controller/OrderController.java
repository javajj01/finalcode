package com.baizhi.controller;

import com.baizhi.entity.Order;
import com.baizhi.service.OrderService;
import com.baizhi.vo.OrderDetail;
import com.baizhi.vo.Paging;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by asus on 2017/6/13.
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("/show")
    @ResponseBody
    public Paging<OrderDetail> show(int page,int rows){
        Paging<OrderDetail> paging = orderService.queryAll(page, rows);
        return paging;
    }
}
