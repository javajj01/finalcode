package com.baizhi.dao;

import com.baizhi.entity.Redpackage;

public interface RedpackageMapper {
    int deleteByPrimaryKey(String id);

    int insert(Redpackage record);

    int insertSelective(Redpackage record);

    Redpackage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Redpackage record);

    int updateByPrimaryKey(Redpackage record);
}