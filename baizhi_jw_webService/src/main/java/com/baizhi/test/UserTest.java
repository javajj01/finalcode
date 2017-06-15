package com.baizhi.test;

import com.baizhi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/6/15.
 */
public class UserTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        UserService us = (UserService) ac.getBean("userService");
        String code = us.phonecode("17839226929");
        System.out.println(code);
    }
}
