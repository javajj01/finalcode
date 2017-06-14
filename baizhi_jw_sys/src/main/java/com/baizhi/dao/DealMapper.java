package com.baizhi.dao;

import com.baizhi.entity.Deal;

import java.util.List;

public interface DealMapper {
    int deleteByPrimaryKey(String id);

    int insert(Deal record);



    Deal selectByPrimaryKey(String id);

    List<Deal> selectAll();


    int updateByPrimaryKey(Deal record);
}