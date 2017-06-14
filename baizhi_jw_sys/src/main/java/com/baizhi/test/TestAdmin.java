package com.baizhi.test;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import com.baizhi.util.Utils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/6/12.
 */
public class TestAdmin {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        AdminService as = (AdminService) ac.getBean("adminService");


        Admin admin = new Admin();
        admin.setAdminname("admin");
        admin.setPassword("123456");
        Admin check = as.check(admin);
        System.out.println(check);

    }
}
