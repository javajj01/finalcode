package com.baizhi.service;

import com.baizhi.annotation.CacheAnnotation;
import com.baizhi.entity.Menu;

import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
public interface MenuService {
    //查询所有的菜单
    @CacheAnnotation
    public List<Menu> selectAll();
}
