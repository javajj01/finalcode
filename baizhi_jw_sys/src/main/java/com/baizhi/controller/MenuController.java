package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private MenuService menuService;

    @RequestMapping("/show")
    @ResponseBody
    public List<Menu> show(){
        List<Menu> menus = menuService.selectAll();
        return menus;
    }

}
