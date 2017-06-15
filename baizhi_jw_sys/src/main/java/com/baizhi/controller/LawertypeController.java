package com.baizhi.controller;

import com.baizhi.entity.Lawertype;
import com.baizhi.service.LawerService;
import com.baizhi.service.LawertypeService;
import com.baizhi.vo.Paging;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
@Controller
@RequestMapping("/lawertype")
public class LawertypeController {

    @Resource
    private LawertypeService lawertypeService;

    @RequestMapping("/show")
    @ResponseBody
    public Paging<Lawertype> show(int page, int rows){
        Page<Lawertype> lawertypes = lawertypeService.queryAll(page, rows);
        Paging<Lawertype> paging = new Paging<Lawertype>();
        paging.setRows(lawertypes.getResult());
        paging.setTotal((int) lawertypes.getTotal());
        return paging;
    }

    @RequestMapping("/add")
    @ResponseBody
    public void add(Lawertype lawertype){

        lawertypeService.add(lawertype);
    }


    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        lawertypeService.delete(id);
    }
    @RequestMapping("/update")
    @ResponseBody
    public void update(Lawertype lawertype){
        lawertypeService.update(lawertype);
    }

    //combobox下拉框
    @RequestMapping("/check")
    @ResponseBody
    public List<Lawertype> showAll(){
        List<Lawertype> lawertypes = lawertypeService.queryAlllawertype();
        return lawertypes;
    }

    //查找一个律师分类
    @RequestMapping("/showOne")
    @ResponseBody
    public Lawertype showOne(String id){
        Lawertype lawertype = lawertypeService.selectOne(id);
        return lawertype;
    }

}
