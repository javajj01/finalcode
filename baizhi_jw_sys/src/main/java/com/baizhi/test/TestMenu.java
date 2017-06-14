package com.baizhi.test;

import com.baizhi.entity.Menu;
import com.baizhi.service.AdminService;
import com.baizhi.service.MenuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
public class TestMenu {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        MenuService ms = (MenuService) ac.getBean("menuService");
        List<Menu> menus = ms.selectAll();
        for (Menu menu : menus) {
            System.out.println("++"+menu);
            for (Menu menu1 : menu.getMenus()) {
                System.out.println(menu1);
            }
        }
    }
}
