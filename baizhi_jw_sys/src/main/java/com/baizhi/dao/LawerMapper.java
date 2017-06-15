package com.baizhi.dao;

import com.baizhi.entity.Lawer;
import com.baizhi.entity.Lawertype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lawer record);



    Lawer selectByPrimaryKey(String id);

    //查询所有的律师
    List<Lawer> selectAll();

    //添加律师的关系表
    public void addlawerandtypeid(@Param("lid") String lid,@Param("lawertypeid") String lawertypeid);


    //删除律师的关系表
    public void deletelawerandtypeid(String id);

    int updateByPrimaryKey(Lawer record);

    //查看该律师的红包记录
    public Lawer selectLawerRedPackage(String id);
    //查看该律师的分类
    public Lawer selectLawerType(String id);
    //查看律师的评价
    public Lawer selectLawerComment(String id);
}