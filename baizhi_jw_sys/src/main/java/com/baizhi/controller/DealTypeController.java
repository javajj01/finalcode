package com.baizhi.controller;

import com.baizhi.entity.Dealtype;
import com.baizhi.service.DealTypeService;
import com.baizhi.vo.Paging;
import com.baizhi.vo.TwoDealtype;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
@Controller
@RequestMapping("/dealtype")
public class DealTypeController {

    @Resource
    private DealTypeService dealTypeService;

    //展示所有
    @RequestMapping("/show")
    @ResponseBody
    public Paging<Dealtype> show(int page,int rows){
        Paging<Dealtype> paging = dealTypeService.queryAll(page, rows);
        return paging;
    }
    //增加一个DealType
    @RequestMapping("/add")
    @ResponseBody
    public void add(Dealtype dealtype){
        dealTypeService.add(dealtype);
    }

    //增加一个DealType
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String  id){
        System.out.println(id+"0------");
        dealTypeService.delete(id);
    }

    //查询子标签
    @RequestMapping("/showTwoDealtype")
    @ResponseBody
    public List<TwoDealtype> showTwoDealType(String  id){
        System.out.println(id);
        List<TwoDealtype> twoDealtypes = dealTypeService.queryTwoDealType(id);
        return twoDealtypes;
    }

    //根据一级标签查询二级
    @RequestMapping("/showTwo")
    @ResponseBody
    public List<Dealtype> showTwo(String id){
        List<Dealtype> dealtypes = dealTypeService.selectTwo(id);
        return dealtypes;
    }
    //查询所有的一级标签
    @RequestMapping("/showOneDealtype")
    @ResponseBody
    public List<Dealtype> showOneTag(){
        List<Dealtype> check = dealTypeService.check();
        return check;
    }

    //查询一个分类
    @RequestMapping("/showOne")
    @ResponseBody
    public Dealtype showOne(String id){
        Dealtype dealtype = dealTypeService.selectOne(id);
        return dealtype;
    }

    //更新一个分类
    @RequestMapping("/update")
    @ResponseBody
    public void update(Dealtype dealtype){
        dealTypeService.update(dealtype);
    }


}
