package com.baizhi.service.impl;

import com.baizhi.dao.LawertypeMapper;
import com.baizhi.entity.Lawertype;
import com.baizhi.service.LawerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
@Service("lawerTypeService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class LawerTypeServiceImpl implements LawerTypeService {

    @Autowired
    private LawertypeMapper lawertypeMapper;

    public List<Lawertype> showAll() {
        List<Lawertype> lawertypes = lawertypeMapper.selectAll();

        return lawertypes;
    }

    public Lawertype showOneById(String id) {
        Lawertype lawertype = lawertypeMapper.selectOneById(id);
        return lawertype;
    }
}
