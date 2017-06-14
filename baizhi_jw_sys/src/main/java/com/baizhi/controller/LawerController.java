package com.baizhi.controller;

import com.baizhi.entity.Lawer;
import com.baizhi.entity.Lawertype;
import com.baizhi.entity.Redpackage;
import com.baizhi.service.LawerService;
import com.baizhi.vo.LawerComment;
import com.baizhi.vo.LawerLawerType;
import com.baizhi.vo.LawerRedPackage;
import com.baizhi.vo.Paging;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
@Controller
@RequestMapping("/lawer")
public class LawerController {
    @Resource
    private LawerService lawerService;

    //查询所有的律师
    @RequestMapping("/show")
    @ResponseBody
    public Paging<Lawer> show(int page,int rows){
        Page<Lawer> lawers = lawerService.queryAll(page, rows);
        Paging<Lawer> paging = new Paging<Lawer>((int)lawers.getTotal(), lawers.getResult());
        return paging;
    }

   @RequestMapping("/add")
   @ResponseBody
   public void add(Lawer lawer,String[] lawertypeid){
       ArrayList<Lawertype> lawertypes = new ArrayList<Lawertype>();
       for (String s : lawertypeid) {
           Lawertype lawertype = new Lawertype();
           lawertype.setId(s);
           lawertypes.add(lawertype);
       }
       lawer.setLawertypes(lawertypes);
       lawerService.add(lawer);
   }

    //删除一个律师
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        lawerService.delete(id);
    }


    //查看一个律师的红包
    @RequestMapping("/lawerRedpackage")
    @ResponseBody
    public List<LawerRedPackage> showLawerRedpackage(String id){

        List<LawerRedPackage> lawerRedPackages = lawerService.queryLawerRedPackage(id);

        return lawerRedPackages;
    }

    //查看一个律师的分类
    @RequestMapping("/lawerLawerType")
    @ResponseBody
    public List<LawerLawerType> showLawerLawerType(String id){
        List<LawerLawerType> lawerLawerTypes = lawerService.queryLawerLawerType(id);
        return lawerLawerTypes;
    }

    //查看一个律师
    @RequestMapping("/lawerComment")
    @ResponseBody
    public List<LawerComment> showLawerComment(String id){
        List<LawerComment> lawerComments = lawerService.queryLawerComment(id);
        return lawerComments;
    }
}
