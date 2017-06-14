package com.baizhi.test;

import com.baizhi.service.DealService;
import com.baizhi.service.LawerService;
import com.baizhi.vo.Deals;
import com.baizhi.vo.Paging;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/6/13.
 */
public class TestDeal {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        DealService ds = (DealService) ac.getBean("dealService");
        Paging<Deals> dealsPaging = ds.queryAll(1, 10);
        for (Deals deals : dealsPaging.getRows()) {
            System.out.println(deals);
        }
    }
}
