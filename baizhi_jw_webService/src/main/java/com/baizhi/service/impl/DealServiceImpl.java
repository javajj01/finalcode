package com.baizhi.service.impl;

import com.baizhi.dao.DealMapper;
import com.baizhi.entity.Deal;
import com.baizhi.service.DealService;
import com.baizhi.util.Utils;
import com.baizhi.vo.Deals;
import com.baizhi.vo.Paging;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.AutoPopulatingList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/6/13.
 */
@Service("dealService")
@Transactional
public class DealServiceImpl implements DealService {

    @Autowired
    private DealMapper dealMapper;


    public void add(Deal deal) {
        deal.setId(Utils.getSnowFlake());
        System.out.println(deal.getDealtype()+"----");
        dealMapper.insert(deal);
    }

    public void delete(String id) {
        dealMapper.deleteByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Paging<Deals> queryAll(int page, int rows) {
        Page<Deal> pages = PageHelper.startPage(page, rows);
        dealMapper.selectAll();
        Paging<Deals> paging= new Paging<Deals>();
        ArrayList<Deals> dealses = new ArrayList<Deals>();
        for (Deal deal : pages.getResult()) {
            Deals deals = new Deals();
            deals.setId(deal.getId());
            deals.setTitle(deal.getTitle());
            deals.setContent(deal.getContent());
            deals.setTypename(deal.getDealtype().getName());
            deals.setCreateDate(deal.getCreatetime());
            dealses.add(deals);
        }

        paging.setTotal((int)pages.getTotal());
        paging.setRows(dealses);
        return paging;
    }
}
