package com.baizhi.service;

import com.baizhi.entity.Lawertype;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
public interface LawerTypeService {
    //查询所有的律师分类
    public List<Lawertype> showAll();
    //根据律师分类id查询该分类下的所有律师
    public Lawertype showOneById(String id);
}
