package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by asus on 2017/6/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/show")
    @ResponseBody
    public Paging<User> show(int page, int rows){
        Paging<User> userPaging = userService.queryAll(page, rows);
        return userPaging;
    }


    @RequestMapping("/showOrder")
    @ResponseBody
    public List<UserOrder> showOrder(String id){
        List<UserOrder> userOrders = userService.queryOrder(id);
        return userOrders;
    }


    @RequestMapping("/showRedpackage")
    @ResponseBody
    public List<UserRedpackage> showRedpackage(String id){
        List<UserRedpackage> userRedpackages = userService.queryRedpackage(id);
        return userRedpackages;
    }


    @RequestMapping("/showFavorite")
    @ResponseBody
    public List<UserLawer> showFavorite(String id){
        List<UserLawer> userLawers = userService.queryLawer(id);
        return userLawers;
    }

    @RequestMapping("showRedpackagecount")
    @ResponseBody
    public RedpackageCounts showcount(){
        RedpackageCounts redpackageCounts = userService.queryAllUserCount();
        return redpackageCounts;
    }
}
