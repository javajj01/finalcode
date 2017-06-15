package com.baizhi.service;

import com.baizhi.entity.Dealtype;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
public interface DealTypeService {
    //展示所有的一级案列
    public List<Dealtype> showOneType();
    //根据id查询一级类别下的所有
    public Dealtype showOneDetail(String id);
    //根据二级id查询
    public Dealtype showByTwoId(String id);
}
