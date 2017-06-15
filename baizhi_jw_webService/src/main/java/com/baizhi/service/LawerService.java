package com.baizhi.service;

import com.baizhi.entity.Lawer;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
public interface LawerService {
    //展示所有的律师
    public List<Lawer> show();
    //展示一个律师的详细信息
    public Lawer showOne(String id);

}
