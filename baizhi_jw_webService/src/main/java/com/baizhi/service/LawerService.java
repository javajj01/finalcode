package com.baizhi.service;

import com.baizhi.annotation.CacheAnnotation;
import com.baizhi.entity.Lawer;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
public interface LawerService {
    //展示所有的律师
    @CacheAnnotation
    public List<Lawer> show();
    //展示一个律师的详细信息
    @CacheAnnotation
    public Lawer showOne(String id);

}
