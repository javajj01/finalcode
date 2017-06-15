package com.baizhi.service.impl;

import com.baizhi.dao.DealtypeMapper;
import com.baizhi.entity.Dealtype;
import com.baizhi.service.DealTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asus on 2017/6/15.
 */
@Service("dealTypeService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class DealTypeServcieImpl implements DealTypeService{


    @Autowired
    private DealtypeMapper dealtypeMapper;




    public List<Dealtype> showOneType() {
        List<Dealtype> dealtypes = dealtypeMapper.selectAll();

        return dealtypes;
    }

    public Dealtype showOneDetail(String id) {
        Dealtype dealtype = dealtypeMapper.selectDetail(id);
        return dealtype;
    }

    public Dealtype showByTwoId(String id) {
        Dealtype dealtype = dealtypeMapper.selectTwo(id);
        return dealtype;
    }
}
