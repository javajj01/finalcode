package com.baizhi.controller;

import com.baizhi.entity.Deal;
import com.baizhi.entity.Dealtype;
import com.baizhi.service.DealService;
import com.baizhi.vo.Deals;
import com.baizhi.vo.Paging;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by asus on 2017/6/13.
 */
@Controller
@RequestMapping("/deal")
public class DealController {

    @Resource
    private DealService dealService;
    //查询所有的
    @RequestMapping("/show")
    @ResponseBody
    public Paging<Deals> show(int page,int rows){
        Paging<Deals> dealsPaging = dealService.queryAll(page, rows);
        return dealsPaging;
    }

    //删除一个
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        dealService.delete(id);
    }
    //添加一个
    @RequestMapping("/add")
    @ResponseBody
    public void add(Deal deal,String dealtypeid){
        System.out.println(deal);
        System.out.println(dealtypeid);
        Dealtype dealtype = new Dealtype();
        dealtype.setId(dealtypeid);
        deal.setDealtype(dealtype);
        dealService.add(deal);
    }
}
