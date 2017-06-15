package com.baizhi.service.impl;

import com.baizhi.dao.RedpackageMapper;
import com.baizhi.entity.Redpackage;
import com.baizhi.service.RedpackageService;
import com.baizhi.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by asus on 2017/6/15.
 */
@Service("redpackageService")
@Transactional
public class RedpackageServiceImpl implements RedpackageService {

    @Autowired
    private RedpackageMapper redpackageMapper;

    public void add(Redpackage redpackage) {
        redpackage.setId(Utils.getSnowFlake());
        redpackageMapper.insert(redpackage);
    }
}
