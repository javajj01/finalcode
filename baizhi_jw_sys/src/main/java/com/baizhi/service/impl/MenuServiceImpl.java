package com.baizhi.service.impl;

import com.baizhi.dao.MenuMapper;
import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
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
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("supper")){
            return menus;
        }else{
            Menu menu1 = new Menu();
            for (Menu menu : menus) {
                if(menu.getName().equals("系统模块")){
                    menu1=menu;
                }
            }
            menus.remove(menu1);
        }
        return menus;
    }


}
