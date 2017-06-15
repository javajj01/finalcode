package com.baizhi.service.impl;

import com.baizhi.dao.DealMapper;
import com.baizhi.entity.Deal;
import com.baizhi.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by asus on 2017/6/15.
 */
@Service("dealService")
public class DealServiceImpl implements DealService {

    @Autowired
    private DealMapper dealMapper;

    public Deal showOneDeal(String id) {
        Deal deal = dealMapper.selectByPrimaryKey(id);
        return deal;
    }
}
