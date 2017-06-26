package com.baizhi.service;

import com.baizhi.annotation.CacheAnnotation;
import com.baizhi.entity.Dealtype;
import com.baizhi.vo.Paging;
import com.baizhi.vo.TwoDealtype;

import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
public interface DealTypeService {
    //添加一个分类
    public void add(Dealtype dealtype);
    //删除一个事件分类
    public void delete(String id);
    //查询所有的时间
    @CacheAnnotation
    public Paging<Dealtype> queryAll(int page,int rows);
    //查询所有的分类
    @CacheAnnotation
    public List<Dealtype> check();
    //根据id查询子标签
    @CacheAnnotation
    public List<TwoDealtype> queryTwoDealType(String id);
    //根据id查询二级分类
    @CacheAnnotation
    public List<Dealtype> selectTwo(String id);
    //查看一个分类
    @CacheAnnotation
    public Dealtype selectOne(String id);
    //更新一个分类
    public void update(Dealtype dealtype);
}
