package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import com.baizhi.vo.Choose;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by asus on 2017/6/12.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public Choose login(Admin admin){

        try {
            Admin check = adminService.check(admin);
            System.out.println(check);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            Choose choose = new Choose(false);
            return choose;
        }
        Choose choose = new Choose(true);
        return choose;
    }
}
