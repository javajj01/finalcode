package com.baizhi.service.impl;

import com.baizhi.dao.LawerMapper;
import com.baizhi.entity.Lawer;
import com.baizhi.service.LawerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
@Service("lawerService")
@Transactional
public class LawerServiceImpl implements LawerService {

    @Autowired
    private LawerMapper lawerMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Lawer> show() {
        List<Lawer> lawers = lawerMapper.selectAll();
        return lawers;
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Lawer showOne(String id) {
        Lawer lawer = lawerMapper.selectLawerComment(id);
        Lawer lawer1 = lawerMapper.selectLawerRedPackage(id);
        Lawer lawer2 = lawerMapper.selectLawerType(id);
        lawer.setRedpackages(lawer1.getRedpackages());
        lawer.setLawertypes(lawer2.getLawertypes());
        return lawer;
    }
}
