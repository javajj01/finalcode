package com.baizhi.service.impl;

import com.baizhi.dao.MenuMapper;
import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Menu> selectAll() {
        List<Menu> menus = menuMapper.selectAll();
        return menus;
    }
}
