package com.baizhi.test;

import com.baizhi.service.DealTypeService;
import com.baizhi.service.LawerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/6/13.
 */
public class TestDealType {
    public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        DealTypeService ds = (DealTypeService) ac.getBean("dealTypeService");
        ds.delete("324206279138476032");

    }

}
