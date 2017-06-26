package com.baizhi.service;

import com.baizhi.annotation.CacheAnnotation;
import com.baizhi.entity.Deal;

/**
 * Created by asus on 2017/6/15.
 */
public interface DealService {
    //根据id查询一个案例
    @CacheAnnotation
    public Deal showOneDeal(String id);
}
