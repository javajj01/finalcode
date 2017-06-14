package com.baizhi.test;

import com.baizhi.service.LawerService;
import com.baizhi.service.UserService;
import com.baizhi.vo.UserLawer;
import com.baizhi.vo.UserOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by asus on 2017/6/14.
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        UserService us = (UserService) ac.getBean("userService");
        List<UserOrder> userOrders = us.queryOrder("1");
        for (UserOrder userOrder : userOrders) {
            System.out.println(userOrder);
        }
    }
}
