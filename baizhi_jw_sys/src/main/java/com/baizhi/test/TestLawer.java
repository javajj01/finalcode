package com.baizhi.test;

import com.baizhi.entity.Lawer;
import com.baizhi.entity.Lawertype;
import com.baizhi.service.LawerService;
import com.baizhi.vo.LawerComment;
import com.baizhi.vo.LawerRedPackage;
import com.github.pagehelper.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.OutlineTextRenderer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
public class TestLawer {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_basic.xml");
        LawerService ls = (LawerService) ac.getBean("lawerService");
        List<LawerComment> lawerComments = ls.queryLawerComment("12");
        for (LawerComment lawerComment : lawerComments) {
            System.out.println(lawerComment);
        }
    }

}
