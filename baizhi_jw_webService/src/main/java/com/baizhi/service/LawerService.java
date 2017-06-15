package com.baizhi.service;

import com.baizhi.entity.Lawer;
import com.baizhi.vo.LawerComment;
import com.baizhi.vo.LawerLawerType;
import com.baizhi.vo.LawerRedPackage;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
public interface LawerService {
    //查询一个律师的信息
    public Lawer queryOne(String id);
    //修改一个律师
    public void update(Lawer lawer);
    //查看所有的律师
    public Page<Lawer> queryAll(int page, int rows);
    //增加一个律师
    public void add(Lawer lawer);
    //删除一个律师
    public void delete(String id);
    //查看一个律师的红包记录
    public List<LawerRedPackage> queryLawerRedPackage(String id);
    //查看一个律师的分类
    public List<LawerLawerType> queryLawerLawerType(String id);
    //查看该律师的评价
    public List<LawerComment> queryLawerComment(String id);

}
