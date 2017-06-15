package com.baizhi.service;

import com.baizhi.entity.Lawertype;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
public interface LawertypeService {
    //查询所有的
    public Page<Lawertype> queryAll(int page, int rows);
    //添加一个分类
    public void add(Lawertype lawertype);
    //删除一个分类
    public void delete(String id);
    //修改一个分类
    public void update(Lawertype lawertype);

    public List<Lawertype> queryAlllawertype();
    //查询一个分类
    public Lawertype selectOne(String id);
}
