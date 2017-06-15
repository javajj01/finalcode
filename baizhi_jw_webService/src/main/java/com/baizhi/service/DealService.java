package com.baizhi.service;

import com.baizhi.entity.Deal;
import com.baizhi.vo.Deals;
import com.baizhi.vo.Paging;

import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
public interface DealService {
    //添加一个解决方案
    public void add(Deal deal);
    //删除一个解决方案
    public void delete(String id);
    //查询所有的解决方案
    public Paging<Deals> queryAll(int page, int rows);
}
