package com.baizhi.service.impl;

import com.baizhi.dao.DealtypeMapper;
import com.baizhi.entity.Dealtype;
import com.baizhi.service.DealTypeService;
import com.baizhi.util.Utils;
import com.baizhi.vo.Paging;
import com.baizhi.vo.TwoDealtype;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
@Service("dealTypeService")
@Transactional
public class DealTypeServiceImpl implements DealTypeService{

    @Autowired
    private DealtypeMapper dealtypeMapper;

    public void add(Dealtype dealtype) {
        dealtype.setId(Utils.getSnowFlake());
        dealtypeMapper.insert(dealtype);
    }

    public void delete(String id) {
        dealtypeMapper.deleteparentid(id);
        dealtypeMapper.deleteByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Paging<Dealtype> queryAll(int page,int rows) {

        Page<Dealtype> pages = PageHelper.startPage(page, rows);
        dealtypeMapper.selectAll();
        Paging<Dealtype> paging = new Paging<Dealtype>();
        paging.setTotal((int) pages.getTotal());
        paging.setRows(pages.getResult());
        return paging;
    }

    public List<Dealtype> check() {
        List<Dealtype> dealtypes = dealtypeMapper.selectAll();
        return dealtypes;
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<TwoDealtype> queryTwoDealType(String id) {
        Dealtype dealtype = dealtypeMapper.selectTwoTag(id);
        List<Dealtype> dealtypes = dealtype.getDealtypes();
        ArrayList<TwoDealtype> li = new ArrayList<TwoDealtype>();
        for (Dealtype dealtype1 : dealtypes) {
            TwoDealtype td = new TwoDealtype();
            td.setOid(dealtype.getId());
            td.setOname(dealtype.getName());
            td.setTwoid(dealtype1.getId());
            td.setTwoname(dealtype1.getName());
            li.add(td);

        }
        return li;
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Dealtype> selectTwo(String id) {
        Dealtype dealtype = dealtypeMapper.selectTwoTag(id);
        List<Dealtype> dealtypes = dealtype.getDealtypes();
        return dealtypes;
    }
}
