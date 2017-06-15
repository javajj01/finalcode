package com.baizhi.service.impl;

import com.baizhi.dao.LawertypeMapper;
import com.baizhi.entity.Lawertype;
import com.baizhi.service.LawertypeService;
import com.baizhi.util.Utils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
@Service
@Transactional
public class LawertypeServiceImpl implements LawertypeService {

    @Autowired
    private LawertypeMapper lawertypeMapper;


    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Page<Lawertype> queryAll(int page,int rows) {
        Page<Lawertype> Lawerpage= PageHelper.startPage(page, rows);
        lawertypeMapper.selectAll();
        return Lawerpage;
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Lawertype> queryAlllawertype() {
        List<Lawertype> lawertypes = lawertypeMapper.selectAll();
        return lawertypes;
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Lawertype selectOne(String id) {
        Lawertype lawertype = lawertypeMapper.selectByPrimaryKey(id);
        return lawertype;
    }

    public void add(Lawertype lawertype) {
        lawertype.setId(Utils.getSnowFlake());
        lawertypeMapper.insert(lawertype);

    }

    public void delete(String id) {
        lawertypeMapper.delete(id);
        lawertypeMapper.deleteByPrimaryKey(id);
    }

    public void update(Lawertype lawertype) {

        lawertypeMapper.updateByPrimaryKey(lawertype);
    }
}
